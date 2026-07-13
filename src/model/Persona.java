package model;

/**
 *
 * Super clase que representa una persona
 */
public class Persona {
    
    /**
     * @param nombre indica el nombre de la persona
     * @param rut indica el rut de la persona
     */
    private String nombre;
    private String rut;

    /**
     * Constructor
     * 
     */
    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    /**
     * Metodo que retorna los datos basicos de la persona
     * 
     */
    public String mostrarDatosBasicos() {
        return "Nombre: " + nombre + "\n"
                + "Rut: " + rut + "\n";
    }
    
}
