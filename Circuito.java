
/**
 * Write a description of class Circuito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circuito
{
    // instance variables - replace the example below with your own
    private String nombreCircuito;
    
    private int numeroCurvas;
    
    private Pais pais;
    
    private boolean carrera;
    /**
     * Constructor for objects of class Circuito
     */
    public Circuito(String nomC, int numCurv, Pais country, boolean carrerita)
    {
        // initialise instance variables
        nombreCircuito = nomC;
        numeroCurvas = numCurv;
        pais = country;
        carrera = carrerita;  
        carrerita = true;
    }
    
    public int getNumerocurvas() {
        return numeroCurvas;
    }
    
    public Pais getPais() {
        return pais;
    }
    
    public String getNombreCircuito() {
        return nombreCircuito;
    }
    
    public void setCarrera(){
        carrera = !carrera;
    }

    public void setNombreCircuito(String nombreCircuito) {
        this.nombreCircuito = nombreCircuito;
    }
    
    public void setNumerocurvas(int numerocurvas) {
        this.numeroCurvas = numerocurvas;
    }
    
    public void setPais (Pais pais){
        this.pais = pais;
    }
    
    public String imprimirDetalles(){
        return ("El circuito se llama" + nombreCircuito + "Y tiene :" + numeroCurvas + "curvas Y esta" + pais.getNombrePais() + "que esta en el continente" + pais.getContinentePais() + "Y este finde el estado de la carrera es" + carrera + ".");
    }
    
}
