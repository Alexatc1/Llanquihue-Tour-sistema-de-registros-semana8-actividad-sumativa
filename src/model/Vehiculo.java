/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * Clase que representa un vehiculo de Llanquihue tour
 */
public class Vehiculo implements Registrable {
    
    private String patente;
    private String marca;

    public Vehiculo(String patente, String marca) {
        this.patente = patente;
        this.marca = marca;
    }
    
    //Getters y Setters

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    //Metodos de interface
    
    /**
     * Metodo para registrar un Vehiculo, retorna un mensaje de
     * que se ha registrado de manera correcta
     */
    @Override
    public String registrar() {
        return "Se ha registrado correctamente el Vehiculo";
    }

    /**
     * Metodo que muestra la informacion del Vehiculo
     * retorna un mensaje con la informacion del vehiculo
     */
    @Override
    public String mostrarResumen() {
        return "Patente: " + patente + "\n"
                + "Marca: " + marca + "\n";
    }
    
    
    
}
