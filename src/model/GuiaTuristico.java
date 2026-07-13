package model;

/**
 *
 * Clase representa un Guia turistico de Llanquihue Tour, y hereda de la super clase Persona
 * implementa la interfas Registrable
 */
public class GuiaTuristico extends Persona implements Registrable {
    
    private String numEmpleado;

    public GuiaTuristico(String numEmpleado, String nombre, String rut) {
        super(nombre, rut);
        this.numEmpleado = numEmpleado;
    }

// Getters y Setters
    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    
    
//Metodos de interface
    
    /**
     * Metodo para registrar un guia turistico, retorna un mensaje de
     * que se ha registrado de manera correcta
     */
    @Override
    public String registrar() {
        return "Se ha registrado correctamente el Guia turistico";
    }

    /**
     * Metodo que muestra la informacion del guia turistico mas a detalle
     * retorna un mensaje mas detallado con la informacion del guia turistico
     */
    @Override
    public String mostrarResumen() {
        return super.mostrarDatosBasicos() +  "el numero de empleado del guia turistico es: " + numEmpleado + "\n";
    }
    
    /**
     * Metodo que muestra la informacion basica y resumida de un guia turistico
     * 
     */
    @Override
    public String mostrarDatosBasicos(){
        return super.mostrarDatosBasicos() +  "NumEmpleado: " + numEmpleado + "\n";
    }
    
}
