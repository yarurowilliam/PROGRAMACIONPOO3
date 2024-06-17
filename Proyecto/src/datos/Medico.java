package datos;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jean
 */
public class Medico extends Persona implements Serializable {

    ArrayList<Medico> listaMedico = new ArrayList<>();
    private String especialidad;
    private String horarioAtencion;

    public Medico() {
        
    }
    

    public Object displayMember;   
    public Object valueMember;
    
    public Medico(Object Nombre, Object id) {
        displayMember = Nombre;
        valueMember = id;
    }

    
    
    @Override
    public String toString() {
        return displayMember.toString();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public static ArrayList<Medico> getList(){
        return ArchivoBinario.leerDatos();
    }
    public int calcularEdad(String fecha) {
        int year = 0;
        try {
            Date fechaNac = new SimpleDateFormat("dd/MM/YY").parse(fecha);

            Calendar fechaNacimiento = Calendar.getInstance();

            Calendar fechaActual = Calendar.getInstance();

            fechaNacimiento.setTime(fechaNac);

            year = (fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR));
            int mes = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
            int dia = fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);

            if ((mes < 0) || (mes == 0 && dia < 0)) {
                year--;
                return year;
            }

        } catch (ParseException ex) {

        }
        return year;
    }
}
