
package ejerciciocoches;


public class Coche {
    
    private String nombrePiloto;
    private int dorsalPiloto;
    private double distanciaCarrera;
    private String estado;
    private int potencia;
    private int velocidad;
    private double kmRecorridos;

    
//constructor por defecto
    public Coche(String nombrePiloto, int dorsalPiloto, double distanciaCarrera) {
        this.nombrePiloto = nombrePiloto;
        this.dorsalPiloto = dorsalPiloto;
        this.distanciaCarrera = distanciaCarrera;
        this.estado = "Parado";
        this.potencia = 50;
        this.velocidad = 0;
        this.kmRecorridos = 0;
    }

    //método que cambia el estado del coche (PARADO --> MARCHA)

    public void arrancarCoche(){

        
    }
    
    
    
//getters y setters    
    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    public int getDorsalPiloto() {
        return dorsalPiloto;
    }

    public void setDorsalPiloto(int dorsalPiloto) {
        this.dorsalPiloto = dorsalPiloto;
    }

    @Override
    public String toString() {
        return "Nombre del piloto: " + nombrePiloto + "/ Dorsal del piloto: " + dorsalPiloto + "/ Distancia de la carrera: " + distanciaCarrera + "/ Estado: " + estado + "/ Potencia: " + potencia + "/ Velocidad: " + velocidad + "/ Km Recorridos: " + kmRecorridos;
    }
    
    
    
}
