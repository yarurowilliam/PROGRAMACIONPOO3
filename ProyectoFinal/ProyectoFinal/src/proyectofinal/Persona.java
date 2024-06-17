package proyectofinal;

import java.io.Serializable;

public class Persona implements Serializable{

    private String id,nombre,tipoPersona;
    private double sisben;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipoPersona
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * @param tipoPersona the tipoPersona to set
     */
    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    /**
     * @return the sisben
     */
    public double getSisben() {
        return sisben;
    }

    /**
     * @param sisben the sisben to set
     */
    public void setSisben(double sisben) {
        this.sisben = sisben;
    }
    
}
