
package ejerciciocoches;

import java.util.Scanner;


public class Carrera {
    
    private String nombre;
    private int distanciaCarrera;
    private Coche[] vCoches;
    private int numCoches;
    
    public Carrera(String nombre, int distanciaCarrera, int numCoches) {
        this.nombre = nombre;
        this.distanciaCarrera = distanciaCarrera;
        this.numCoches = numCoches;
        this.vCoches = new Coche[numCoches];
    }
    
    
    
    //método para añadir un nuevo coche
    public void añadirCoche(){
        
        Scanner leer = new Scanner(System.in);
        int dorsal;
        String nombre;
        boolean dorsalExistente = false;
        
        leer = new Scanner(System.in);
        System.out.println("Dime el nombre del piloto");
        nombre = leer.nextLine();
        
        leer = new Scanner(System.in);
        System.out.println("Dime el dorsal del piloto");
        dorsal = leer.nextInt();
        
        do{
            dorsalExistente = false;
            for (int i = 0; i < vCoches.length; i++) {
            
                if(vCoches[i] != null && vCoches[i].getDorsalPiloto() == dorsal){
                    dorsalExistente = true;
                }
            }
        
            if(dorsalExistente == true){
                leer = new Scanner(System.in);
                System.out.println("Dorsal existente, dime otro");
                dorsal = leer.nextInt();
            }
            
        }while(dorsalExistente);
        
        for (int i = 0; i < vCoches.length; i++) {
            
            if(vCoches[i] == null){
                vCoches[i] = new Coche(nombre, dorsal, distanciaCarrera);
                break;
            }
        } 
        
    }
        
    //método que muestra todos los coches
    public void mostrarCoches(){
        
        for (int i = 0; i < vCoches.length; i++) {
            
            if(vCoches[i] != null){
                System.out.println(vCoches[i]);
                
            }
        }
    }
    
    //getters y setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDistanciaCarrera(int distanciaCarrera) {
        this.distanciaCarrera = distanciaCarrera;
    }

    public void setNumCoches(int numCoches) {
        this.numCoches = numCoches;
    }
    
}
