/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
*/
package ejercicio_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1ra parte: Este programa guarda razas de perros en un ArrayList y luego las muestra.");
        Scanner leer = new Scanner(System.in);
        ArrayList<String> RazaPerro = new ArrayList();
        String respuesta;
        boolean continuar = false;
        
        do{
            System.out.print("Ingrese una raza de perro: ");
            RazaPerro.add(leer.next());
            
            do{
                System.out.print("¿Desea agregar otra raza?(s/n) ");
                respuesta = leer.next().toLowerCase();
                switch(respuesta){
                    case "s":
                        continuar=true;
                        break;
                    case "n":
                        continuar=false;
                        break;
                    default:
                        System.out.println("Opción no valida");
                }
            }while(!(respuesta.equals("s")||respuesta.equals("n")));
            
        }while(continuar==true);
        
        System.out.println("\nMostrando ArrayList(Raza de Perros): ");
        
        for(String i: RazaPerro){
            System.out.println(i);
        }
        
        System.out.println("\n2da parte: ");
        String raza;
        System.out.print("Ingrese una raza de perro para buscar y eliminar de la ArrayList: ");
        raza=leer.next();
        int cont=0,tam=RazaPerro.size();
        
        Iterator it = RazaPerro.iterator();
        
        while(it.hasNext()){
            if(it.next().equals(raza)){
                it.remove();
            }else{
                cont++;
            }
        }
        
        System.out.println("La raza "+raza+" "+((cont==tam)?"no se eliminó":"se eliminó")+" de la ArrayList.");
        
        Collections.sort(RazaPerro);
        
        System.out.println("\nMostrando ArrayList ordenado(Raza de Perros): ");
        
        for(String i: RazaPerro){
            System.out.println(i);
        }
    }
    
}
