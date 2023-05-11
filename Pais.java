
/**
 * Write a description of class Pais here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pais
{
    // instance variables - replace the example below with your own
    private String nombrePais;
    private String continentePais;
    /**
     * Constructor for objects of class Pais
     */
    public Pais(String nomP, String contp)
    {
        // initialise instance variables
        nombrePais = nomP;
        continentePais = contp;
    }

     public String getNombrePais() {
        return nombrePais;
    }
    
    public void setNombrePais(String nombrePais){
        this.nombrePais = nombrePais;
    }
    
    public void setContinentePais(String continentePais){
        this.continentePais = continentePais;
    }
    
    public String imprimirDetalles(){
        return ("El nombre del pais es :" + nombrePais + "Y esta en el continente :" + continentePais);
    }
    
}
