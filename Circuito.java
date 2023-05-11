
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
    /**
     * Constructor for objects of class Circuito
     */
    public Circuito(String nomC, int numCurv, Pais country)
    {
        // initialise instance variables
        nombreCircuito = nomC;
        numeroCurvas = numCurv;
        pais = country;
    }
    
    public int getNumerocurvas() {
        return numeroCurvas;
    }

    public void setNumerocurvas(int numerocurvas) {
        this.numeroCurvas = numerocurvas;
    }
    
    public String imprimirDetalles(){
        return ("El circuito se llama" + nombreCircuito + "Y tiene" + numeroCurvas + "curvas");
    }
}
