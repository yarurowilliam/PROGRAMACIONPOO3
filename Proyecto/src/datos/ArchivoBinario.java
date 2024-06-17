/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Jean
 */
public class ArchivoBinario {

    public static ArrayList<Medico> leerDatos() {
        ArrayList<Medico> listaMedico = new ArrayList<>();
        ObjectInputStream lector = null;

        try {
            lector = new ObjectInputStream(new FileInputStream("hospital.medico"));
            listaMedico = (ArrayList<Medico>) lector.readObject();
        } catch (Exception e) {
        } finally {
            if (lector != null) {

                try {
                    lector.close();

                } catch (IOException e) {
                }
            }

        }
        return listaMedico;
    }

    public static String escribirDatos(ArrayList<Medico> listaMedico) {
        ObjectOutputStream escritor = null;
        String respuesta;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream("hospital.medico"));
            escritor.writeObject(listaMedico);
            respuesta = "AGREGADADO CORRECTAMENTE";
        } catch (IOException ex) {
            respuesta = "ERROR al escribir en el archivo";
        } finally {
            if (escritor != null) {
                try {
                    escritor.close();
                } catch (IOException e) {
                }
            }
        }
        return respuesta;
    }

    public static ArrayList<Paciente> leerDatosPa() {
        ArrayList<Paciente> listaPaciente = new ArrayList<>();
        ObjectInputStream lector = null;

        try {
            lector = new ObjectInputStream(new FileInputStream("hospital.paciente"));
            listaPaciente = (ArrayList<Paciente>) lector.readObject();
        } catch (Exception e) {
        } finally {
            if (lector != null) {

                try {
                    lector.close();

                } catch (IOException e) {
                }
            }

        }
        return listaPaciente;
    }

    public static String escribirDatosPa(ArrayList<Paciente> listaPaciente) {
        ObjectOutputStream escritor = null;
        String respuesta;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream("hospital.paciente"));
            escritor.writeObject(listaPaciente);
            respuesta = "AGREGADADO CORRECTAMENTE";
        } catch (IOException ex) {
            respuesta = "ERROR al escribir en el archivo";
        } finally {
            if (escritor != null) {
                try {
                    escritor.close();
                } catch (IOException e) {
                }
            }
        }
        return respuesta;
    }

    public static ArrayList<Citas> leerDatosCi() {
        ArrayList<Citas> listaCitas = new ArrayList<>();
        ObjectInputStream lector = null;

        try {
            lector = new ObjectInputStream(new FileInputStream("hospital.citas"));
            listaCitas = (ArrayList<Citas>) lector.readObject();
        } catch (Exception e) {
        } finally {
            if (lector != null) {

                try {
                    lector.close();

                } catch (IOException e) {
                }
            }

        }
        return listaCitas;
    }

    public static String escribirDatosCi(ArrayList<Citas> listacitas) {
        ObjectOutputStream escritor = null;
        String respuesta;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream("hospital.citas"));
            escritor.writeObject(listacitas);
            respuesta = "AGREGADADO CORRECTAMENTE";
        } catch (IOException ex) {
            respuesta = "ERROR al escribir en el archivo";
        } finally {
            if (escritor != null) {
                try {
                    escritor.close();
                } catch (IOException e) {
                }
            }
        }
        return respuesta;
    }
    
    public static ArrayList<Medicamento> leerDatosMe() {
        ArrayList<Medicamento> listaMediciamento = new ArrayList<>();
        ObjectInputStream lector = null;

        try {
            lector = new ObjectInputStream(new FileInputStream("hospital.citas"));
            listaMediciamento = (ArrayList<Medicamento>) lector.readObject();
        } catch (Exception e) {
        } finally {
            if (lector != null) {

                try {
                    lector.close();

                } catch (IOException e) {
                }
            }

        }
        return listaMediciamento;
    }
    
    public static String escribirDatosMe(ArrayList<Medicamento> listaMediciamento) {
        ObjectOutputStream escritor = null;
        String respuesta;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream("hospital.medicamentos"));
            escritor.writeObject(listaMediciamento);
            respuesta = "AGREGADADO CORRECTAMENTE";
        } catch (IOException ex) {
            respuesta = "ERROR al escribir en el archivo";
        } finally {
            if (escritor != null) {
                try {
                    escritor.close();
                } catch (IOException e) {
                }
            }
        }
        return respuesta;
    }
}
