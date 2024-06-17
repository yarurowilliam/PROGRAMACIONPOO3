
package datos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jean
 */
public class Citas implements Serializable {
    private String tipoIdentidad, identidadPaciente;
    private String nombrePaciente;
    private String apellido;
    private String fecha;
    private String hora;
    private String nombreDoctor;
    private String tipo;
    ArrayList<Medico> listaMedicos;

    
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    
    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    
    public String getFecha() {
        return fecha;
    }

    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    public String getHora() {
        return hora;
    }

    
    public void setHora(String hora) {
        this.hora = hora;
    }

    
    public String getNombreDoctor() {
        return nombreDoctor;
    }

    
    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

   
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    /**
     * @return the identidadPaciente
     */
    public String getIdentidadPaciente() {
        return identidadPaciente;
    }

    /**
     * @param identidadPaciente the identidadPaciente to set
     */
    public void setIdentidadPaciente(String identidadPaciente) {
        this.identidadPaciente = identidadPaciente;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
