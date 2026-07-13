package model;

/**
 *
 * Clase representa un colaborador externo de Llanquihue Tour, y hereda de la super clase Persona
 * implementa la interfas Registrable
 */
public class ColaboradorExterno extends Persona implements Registrable {
    
    private String area;

    public ColaboradorExterno(String area, String nombre, String rut) {
        super(nombre, rut);
        this.area = area;
    }

    //Getters y Setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    
    //Metodos de interface
    
    /**
     * Metodo para registrar un colaborador externo, retorna un mensaje de
     * que se ha registrado de manera correcta
     */
    @Override
    public String registrar() {
        return "Se ha registrado correctamente el Colaborador externo";
    }

    /**
     * Metodo que muestra la informacion del colaborador externo mas a detalle
     * retorna un mensaje mas detallado con la informacion del colaborador externo
     */
    @Override
    public String mostrarResumen() {
        return super.mostrarDatosBasicos() +  "el Area de trabajo del colaborador externo es: " + area + "\n";
    }
    
    /**
     * Metodo que muestra la informacion basica y resumida de un colaborador externo
     * 
     */
    @Override
    public String mostrarDatosBasicos(){
        return super.mostrarDatosBasicos() +  "Area: " + area + "\n";
    }
    
}
