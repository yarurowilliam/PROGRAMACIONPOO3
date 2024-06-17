/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.Serializable;

/**
 *
 * @author Jean
 */
public class Persona implements Serializable {
    private String tipoIdentidad;
    private String identidad;
    private String nombre;
    private String apellido;
    private String edad;
    private String tipoSangre;
    private String telefono;

    
    public String getIdentidad() {
        return identidad;
    }

    
    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

   
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellido() {
        return apellido;
    }

    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public String getEdad() {
        return edad;
    }

    
    public void setEdad(String edad) {
        this.edad = edad;
    }

    
    public String getTipoSangre() {
        return tipoSangre;
    }

    
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    
    public String getTelefono() {
        return telefono;
    }

    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the tipoIdentidad
     */
    public String getTipoIdentidad() {
        return tipoIdentidad;
    }

    /**
     * @param tipoIdentidad the tipoIdentidad to set
     */
    public void setTipoIdentidad(String tipoIdentidad) {
        this.tipoIdentidad = tipoIdentidad;
    }
}
