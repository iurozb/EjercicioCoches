
package ejerciciocoches;

import java.util.Scanner;

public class EjercicioCoches {

   
    //método que introduce los datos de la carrera 
    private static Carrera configurarCarrera(){
        Scanner leer = new Scanner(System.in);
        String nombre;
        int distancia, numCoches;
        
        Carrera c;
        
        System.out.println("Vamos a configurar la carrera");
        System.out.println("Nombre de la carrera:");
        nombre = leer.nextLine();
        
        leer = new Scanner(System.in);
        System.out.println("Distancia de la carrera:");
        distancia = leer.nextInt();
        
        leer = new Scanner(System.in);
        System.out.println("Número de coches que participan:");
        numCoches = leer.nextInt();
        
        c = new Carrera(nombre, distancia, numCoches);
        
        return c;

    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
       
        Carrera c = configurarCarrera();
        
        do{
            Menu.mostrarMenu();
            opc = leer.nextInt();
            
            switch(opc){
                case 1:
                   c.añadirCoche();
                   break;
                case 2:
                    c.mostrarCoches();
                    break;
                    
           }
            
        }while(opc != 0);
        
    }
    
}
