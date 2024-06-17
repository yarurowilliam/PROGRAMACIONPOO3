package archivos;

import java.io.*;
import proyectofinal.Producto;
import java.util.ArrayList;
import proyectofinal.Facturacion;
import proyectofinal.Persona;

public class ManejoBinario {

    public static void guardarBinarioCliente(ArrayList<Persona> listaCliente) {
        ObjectOutputStream escritor = null;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream("Clientes.heladeria"));
            escritor.writeObject(listaCliente);
        } catch (IOException ex) {
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException err) {
            }
        }
    }

    public static ArrayList<Persona> leerBinarioCliente() {
        ObjectInputStream lector = null;
        ArrayList<Persona> listaCliente = new ArrayList<>();
        try {
            lector = new ObjectInputStream(new FileInputStream("Clientes.heladeria"));
            listaCliente = (ArrayList<Persona>) lector.readObject();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (Exception err) {

            }
        }
        return listaCliente;
    }

    public static void guardarBinarioVentas(ArrayList<Producto> listaVentas) {
        ObjectOutputStream escritor = null;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream("Ventas.heladeria"));
            escritor.writeObject(listaVentas);
        } catch (IOException ex) {
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException err) {
            }
        }
    }

    public static ArrayList<Producto> leerBinarioVentas() {
        ObjectInputStream lector = null;
        ArrayList<Producto> listaVentas = new ArrayList<>();
        try {
            lector = new ObjectInputStream(new FileInputStream("Ventas.heladeria"));
            listaVentas = (ArrayList<Producto>) lector.readObject();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (Exception err) {

            }
        }
        return listaVentas;
    }

    public static void guardarBinarioCompras(ArrayList<Producto> listaCompras) {
        ObjectOutputStream escritor = null;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream("Compras.heladeria"));
            escritor.writeObject(listaCompras);
        } catch (IOException ex) {
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException err) {
            }
        }
    }

    public Object leerObjeto(String archivo) {
        Object objeto = new Object();
        ObjectInputStream lector = null;
        try {
            lector = new ObjectInputStream(new FileInputStream("C:\\Users\\Niyer\\Desktop\\ProyectoFinal" + archivo));
            objeto = lector.readObject();
        } catch (Exception ex) {
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (Exception err) {
            }
        }
        return objeto;
    }

    public static ArrayList<Producto> leerBinarioCompras() {
        ObjectInputStream lector = null;
        ArrayList<Producto> listaCompras = new ArrayList<>();
        try {
            lector = new ObjectInputStream(new FileInputStream("Compras.heladeria"));
            listaCompras = (ArrayList<Producto>) lector.readObject();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (Exception err) {

            }
        }
        return listaCompras;
    }

    public void guardarListaEstudianteN(ArrayList<Facturacion> listaVentas) {
        ObjectOutputStream escritor = null;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream("C:/Users/WILLIAM ANDRES/Desktop/Programacion/ProyectoFinal/Ventas.heladeria"));
            escritor.writeObject(listaVentas);
        } catch (IOException ex) {
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException err) {
            }
        }
    }
}
