package planificadordisco;

public class Nodo {
    public int peticion;
    public int TLL;
    public double TB;
    public double TR;
    public double TE;
    
    public boolean estado;
    
    public Nodo siguiente;
    public Nodo anterior;
    
    public Nodo(int peticion){
        this.peticion=peticion;            
    }
    
    public Nodo(int peticion, int tll){
        this.peticion = peticion;
        this.TLL = tll;
        this.TB=0;
        this.TR=0;
        this.TE=0;
        this.estado = false;        
    }    
}
