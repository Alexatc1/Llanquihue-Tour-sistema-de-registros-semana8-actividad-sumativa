package model;

/**
 *
 * Interface que indica que algo es registrable como un vehiculo, guia, colaborador
 * externo, etc.
 */
public interface Registrable {
    
    public String registrar();
    
    public String mostrarResumen();
    
}
