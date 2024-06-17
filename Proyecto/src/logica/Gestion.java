package logica;

import datos.*;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Gestion {

    public static String agregarMedicos(String tipoIdentidad, String identidad, String nombre, String apellido, String edad,
            String tipoSangre, String telefono, String especialidad, String horarioAtencion) {

        String respuesta;
        if (esVacio(tipoIdentidad) || esVacio(identidad) || esVacio(nombre) || esVacio(apellido) || esVacio(edad) || esVacio(tipoSangre) || esVacio(telefono) || esVacio(especialidad) || esVacio(horarioAtencion)) {
            respuesta = "Hay un campos Vacios";
        } else {
            Medico medico = new Medico();
            medico.setTipoIdentidad(tipoIdentidad);
            medico.setIdentidad(identidad);
            medico.setNombre(nombre);
            medico.setApellido(apellido);
            medico.setEdad(edad);
            medico.setTipoSangre(tipoSangre);
            medico.setTelefono(telefono);
            medico.setEspecialidad(especialidad);
            medico.setHorarioAtencion(horarioAtencion);

            ArrayList<Medico> lista = ArchivoBinario.leerDatos();
            lista.add(medico);
            respuesta = ArchivoBinario.escribirDatos(lista);
        }

        return respuesta;

    }

    public static DefaultTableModel getModeloTablaMedicos() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {"TIPO IDENTIDAD", "IDENTIDAD", "NOMBRE", "APELLIDO",
            "EDAD", "TIPO SANGRE", "TELEFONO", "ESPECIALIDAD", "HORARIO ATENCION"};
        modelo.setColumnIdentifiers(nombreColumnas);
        ArrayList<Medico> listaMedico;
        listaMedico = ArchivoBinario.leerDatos();
        for (Medico medico : listaMedico) {
            String[] fila = {medico.getTipoIdentidad(), medico.getIdentidad(), medico.getNombre(), medico.getApellido(),
                medico.getEdad(), medico.getTipoSangre(), medico.getTelefono(), medico.getEspecialidad(), medico.getHorarioAtencion()};
            modelo.addRow(fila);
        }

        return modelo;
    }

    public static String eliminar(int fila) {
        ArrayList<Medico> lista = ArchivoBinario.leerDatos();
        lista.remove(fila);
        return ArchivoBinario.escribirDatos(lista);
    }

    public static String modificarMedicos(String tipoIdentidad, String identidad, String nombre, String apellido, String edad,
            String tipoSangre, String telefono, String especialidad, String horarioAtencion, int fila) {

        String respuesta;
        if (esVacio(tipoIdentidad) || esVacio(identidad) || esVacio(nombre) || esVacio(apellido) || esVacio(edad) || esVacio(tipoSangre) || esVacio(telefono) || esVacio(especialidad) || esVacio(horarioAtencion)) {
            respuesta = "Hay un campos Vacios";
        } else {
            Medico medico = new Medico();
            medico.setTipoIdentidad(tipoIdentidad);
            medico.setIdentidad(identidad);
            medico.setNombre(nombre);
            medico.setApellido(apellido);
            medico.setEdad(edad);
            medico.setTipoSangre(tipoSangre);
            medico.setTelefono(telefono);
            medico.setEspecialidad(especialidad);
            medico.setHorarioAtencion(horarioAtencion);

            ArrayList<Medico> lista = ArchivoBinario.leerDatos();
            lista.set(fila, medico);
            respuesta = ArchivoBinario.escribirDatos(lista);
        }

        return respuesta;

    }



    public static String agregarPacientes(String tipoIdentidad, String identidad, String nombre, String apellido, String edad,
            String tipoSangre, String telefono) {
        String respuesta;

        if (esVacio(tipoIdentidad) || esVacio(identidad) || esVacio(nombre) || esVacio(apellido) || esVacio(edad) || esVacio(tipoSangre) || esVacio(telefono)) {
            respuesta = "Hay un campos Vacios";
        } else {

            Paciente paciente = new Paciente();
            paciente.setTipoIdentidad(tipoIdentidad);
            paciente.setIdentidad(identidad);
            paciente.setNombre(nombre);
            paciente.setApellido(apellido);
            paciente.setEdad(edad);
            paciente.setTipoSangre(tipoSangre);
            paciente.setTelefono(telefono);

            ArrayList<Paciente> listaPaciente = ArchivoBinario.leerDatosPa();

            listaPaciente.add(paciente);

            respuesta = ArchivoBinario.escribirDatosPa(listaPaciente);

        }
        return respuesta;
    }

    public static DefaultTableModel getModeloTablaPacientes() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {"TIPO IDENTIDAD", "IDENTIDAD", "NOMBRE", "APELLIDO",
            "EDAD", "TIPO SANGRE", "TELEFONO"};
        modelo.setColumnIdentifiers(nombreColumnas);
        ArrayList<Paciente> listaPaciente;
        listaPaciente = ArchivoBinario.leerDatosPa();
        for (Paciente paciente : listaPaciente) {
            String[] fila = {paciente.getTipoIdentidad(), paciente.getIdentidad(), paciente.getNombre(), paciente.getApellido(),
                paciente.getEdad(), paciente.getTipoSangre(), paciente.getTelefono()};
            modelo.addRow(fila);
        }

        return modelo;
    }

    public static String eliminarPacientes(int fila) {
        ArrayList<Paciente> listaPaciente = ArchivoBinario.leerDatosPa();
        listaPaciente.remove(fila);
        return ArchivoBinario.escribirDatosPa(listaPaciente);
    }

    public static String ModificarPacientes(String tipoIdentidad, String identidad, String nombre, String apellido, String edad,
            String tipoSangre, String telefono, int fila) {
        String respuesta;

        if (esVacio(tipoIdentidad) || esVacio(identidad) || esVacio(nombre) || esVacio(apellido) || esVacio(edad) || esVacio(tipoSangre) || esVacio(telefono)) {
            respuesta = "Hay un campos Vacios";
        } else {

            Paciente paciente = new Paciente();
            paciente.setTipoIdentidad(tipoIdentidad);
            paciente.setIdentidad(identidad);
            paciente.setNombre(nombre);
            paciente.setApellido(apellido);
            paciente.setEdad(edad);
            paciente.setTipoSangre(tipoSangre);
            paciente.setTelefono(telefono);

            ArrayList<Paciente> listaPaciente = ArchivoBinario.leerDatosPa();

            listaPaciente.set(fila, paciente);

            respuesta = ArchivoBinario.escribirDatosPa(listaPaciente);

        }
        return respuesta;
    }

    public static DefaultTableModel getModeloTablaCitas() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {"TIPO IDENTIDAD", "IDENTIDAD", "NOMBRE", "APELLIDO",
            "FECHA", "HORA", "TIPO CITA", "DOCTOR"};
        modelo.setColumnIdentifiers(nombreColumnas);
        ArrayList<Citas> listaCitas;
        listaCitas = ArchivoBinario.leerDatosCi();
        for (Citas citas : listaCitas) {
            String[] fila = {citas.getTipoIdentidad(), citas.getIdentidadPaciente(), citas.getNombrePaciente(), citas.getApellido(),
                citas.getFecha(), citas.getHora(), citas.getTipo(), citas.getNombreDoctor()};
            modelo.addRow(fila);
        }

        return modelo;
    }

    public static String agregarCitas(String tipoIdentidad, String identidadPaciente, String nombre, String apellido, String fecha,
            String hora, String tipo, String nombreDoctor) {

        String respuesta;

        if (esVacio(tipoIdentidad) || esVacio(identidadPaciente) || esVacio(nombre) || esVacio(apellido) || esVacio(fecha) || esVacio(hora) || esVacio(tipo) || esVacio(nombreDoctor)) {
            respuesta = "Hay un campos Vacios";
        } else {
            Citas citas = new Citas();
            citas.setTipoIdentidad(tipoIdentidad);
            citas.setIdentidadPaciente(identidadPaciente);
            citas.setNombrePaciente(nombre);
            citas.setApellido(apellido);
            citas.setFecha(fecha);
            citas.setHora(hora);
            citas.setTipo(tipo);
            citas.setNombreDoctor(nombreDoctor);

            ArrayList<Citas> listaCitas = ArchivoBinario.leerDatosCi();

            listaCitas.add(citas);

            respuesta = ArchivoBinario.escribirDatosCi(listaCitas);

        }
        return respuesta;
    }

    public static String modificarCitas(String tipoIdentidad, String identidadPaciente, String nombre, String apellido, String fecha,
            String hora, String tipo, String nombreDoctor, int fila) {

        String respuesta;

        if (esVacio(tipoIdentidad) || esVacio(identidadPaciente) || esVacio(nombre) || esVacio(apellido) || esVacio(fecha) || esVacio(hora) || esVacio(tipo) || esVacio(nombreDoctor)) {
            respuesta = "Hay un campos Vacios";
        } else {
            Citas citas = new Citas();
            citas.setTipoIdentidad(tipoIdentidad);
            citas.setIdentidadPaciente(identidadPaciente);
            citas.setNombrePaciente(nombre);
            citas.setApellido(apellido);
            citas.setFecha(fecha);
            citas.setHora(hora);
            citas.setTipo(tipo);
            citas.setNombreDoctor(nombreDoctor);

            ArrayList<Citas> listaCitas = ArchivoBinario.leerDatosCi();

            listaCitas.set(fila, citas);

            respuesta = ArchivoBinario.escribirDatosCi(listaCitas);

        }
        return respuesta;
    }

    public static String eliminarCitas(int fila) {
        ArrayList<Citas> listaCitas = ArchivoBinario.leerDatosCi();
        listaCitas.remove(fila);
        return ArchivoBinario.escribirDatosCi(listaCitas);
    }
    
    
     public static DefaultTableModel getModeloTablaMedicmentos() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {"CODIGO", "NOMBRE", "CANTIDAD"};
        modelo.setColumnIdentifiers(nombreColumnas);
        ArrayList<Medicamento> listaMedicamento;
        listaMedicamento = ArchivoBinario.leerDatosMe();
        for (Medicamento me : listaMedicamento) {
            String[] fila = {me.getCodigo(), me.getNombre(), ""+ me.getCantidad()};
            modelo.addRow(fila);
        }

        return modelo;
    }
     
      public static String agregarMedicamento(String codigo, String nombre, String cantidad) {

        String respuesta;

        if (esVacio(codigo) || esVacio(nombre) || !esEntero(cantidad)) {
            respuesta = "Hay un campos Vacios";
        } else {
            Medicamento me = new Medicamento();
            me.setCodigo(codigo);
            me.setNombre(nombre);
            me.setCantidad(Integer.parseInt(cantidad));
            

            ArrayList<Medicamento> listaMedicamento = ArchivoBinario.leerDatosMe();

            listaMedicamento.add(me);

            respuesta = ArchivoBinario.escribirDatosMe(listaMedicamento);

        }
        return respuesta;
    }

      public static String modificarMedicamento(String codigo, String nombre, String cantidad, int fila) {

        String respuesta;

        if (esVacio(codigo) || esVacio(nombre) || !esEntero(cantidad)) {
            respuesta = "Hay un campos Vacios";
        } else {
            Medicamento me = new Medicamento();
            me.setCodigo(codigo);
            me.setNombre(nombre);
            me.setCantidad(Integer.parseInt(cantidad));
            

            ArrayList<Medicamento> listaMedicamento = ArchivoBinario.leerDatosMe();

            listaMedicamento.add(fila, me);

            respuesta = ArchivoBinario.escribirDatosMe(listaMedicamento);

        }
        return respuesta;
    }
      
       public static String eliminarMedicamento(int fila) {
       ArrayList<Medicamento> listaMedicamento = ArchivoBinario.leerDatosMe();
        listaMedicamento.remove(fila);
        return ArchivoBinario.escribirDatosMe(listaMedicamento);
    }
    public static boolean esVacio(String dato) {
        return dato.trim().equals("");
    }
    
    public static boolean esEntero(String dato){
        try{
            Integer.parseInt(dato);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    private int getPosicion(String identidad) {
        int i = 0;
        for (Medico medico : ArchivoBinario.leerDatos()) {
            if (medico.getIdentidad().equals(identidad)) {
                return i;
            }
            i = i + 1;
        }
        return -1;
    }

    private boolean validarIdentidad(String identidad) {
        for (Medico medicoInterno : ArchivoBinario.leerDatos()) {
            if (identidad.equals(medicoInterno.getIdentidad())) {
                return true;
            }

        }
        return false;
    }

}
