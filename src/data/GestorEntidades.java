package data;

import java.util.ArrayList;
import java.util.List;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

/**
 Gestiona (guarda y muestra) todos los usuarios del sistema PuertoGames.
 *
 * Clase es una lista para almacenar las distintas entidades registrables dentro de 
 * Llanquihue Tour como guias turisticos, vehiculos y colaboradores externos
 * 
 */
public class GestorEntidades {
    
    /** Lista donde se guardan todasa las entidades registrables. 
     * 
     */
    private List<Registrable> listaEntidades;
    
    /**
     * Constructor.
     */   
    public GestorEntidades() {
        listaEntidades = new ArrayList<>();
    }
    
    
    /**
     * Agrega una entidad a la lista.
     *
     * El parámetro es de tipo Registrable, por lo que acepta cualquier
     * objeto que herede de ella.
     *
     * @param entidad es la entidad que se quiera agregar a la lista
     */
    public void agregarEntidad(Registrable entidad) {
        listaEntidades.add(entidad);
    }
    
    /**
     * Construye un texto con el resumen de todas las entidades registrados.
     *
     * Recorre la lista con un bucle for-each. Para cada entidad usa el
     * operador instanceof.
     *
     * @return un texto con los datos de todos las entidades, o un mensaje indicando
     *         que no hay entidades si la lista está vacía
     */
    public String obtenerResumenEntidades() {

        if (listaEntidades.isEmpty()) {
            return "No hay entidades registrados.";
        }

        String resumen = "";

        for (Registrable entidad : listaEntidades) {

            if (entidad instanceof GuiaTuristico) {

                GuiaTuristico guiaturistico = (GuiaTuristico) entidad;

                resumen += "Tipo detectado correctamente, esta es una instancia de: Guia Turistico.\n";
                resumen += guiaturistico.mostrarDatosBasicos();

            } else if (entidad instanceof ColaboradorExterno) {

                ColaboradorExterno colaboradorexterno = (ColaboradorExterno) entidad;

                resumen += "Tipo detectado correctamente, esta es una instancia de: Colaborador Externo.\n";
                resumen += colaboradorexterno.mostrarDatosBasicos();

            } else if (entidad instanceof Vehiculo) {

                Vehiculo vehiculo = (Vehiculo) entidad;

                resumen += "Tipo detectado correctamente, esta es una instancia de: Vehiculo.\n";
                resumen += vehiculo.mostrarResumen();
            }

            resumen += "========================\n";
        }

        return resumen;
    }
    
}
