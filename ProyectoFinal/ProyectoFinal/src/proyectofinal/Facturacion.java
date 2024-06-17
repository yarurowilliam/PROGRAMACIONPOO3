package proyectofinal;

import java.io.Serializable;

public class Facturacion extends Persona implements Serializable {

    private String idea;
    private String NombreA;
    private double SisbenA;
    private String TipoPersonaA;
    private String TipoProductoA;
    private String NombreProductoA;
    private double PrecioA;
    private int CantidadA;
    private double TotalPagar;

    /**
     * @return the idea
     */
    public String getIdea() {
        return idea;
    }

    /**
     * @param idea the idea to set
     */
    public void setIdea(String idea) {
        this.idea = idea;
    }

    /**
     * @return the NombreA
     */
    public String getNombreA() {
        return NombreA;
    }

    /**
     * @param NombreA the NombreA to set
     */
    public void setNombreA(String NombreA) {
        this.NombreA = NombreA;
    }

    /**
     * @return the SisbenA
     */
    public double getSisbenA() {
        return SisbenA;
    }

    /**
     * @param SisbenA the SisbenA to set
     */
    public void setSisbenA(double SisbenA) {
        this.SisbenA = SisbenA;
    }

    /**
     * @return the TipoPersonaA
     */
    public String getTipoPersonaA() {
        return TipoPersonaA;
    }

    /**
     * @param TipoPersonaA the TipoPersonaA to set
     */
    public void setTipoPersonaA(String TipoPersonaA) {
        this.TipoPersonaA = TipoPersonaA;
    }

    /**
     * @return the TipoProductoA
     */
    public String getTipoProductoA() {
        return TipoProductoA;
    }

    /**
     * @param TipoProductoA the TipoProductoA to set
     */
    public void setTipoProductoA(String TipoProductoA) {
        this.TipoProductoA = TipoProductoA;
    }

    /**
     * @return the NombreProductoA
     */
    public String getNombreProductoA() {
        return NombreProductoA;
    }

    /**
     * @param NombreProductoA the NombreProductoA to set
     */
    public void setNombreProductoA(String NombreProductoA) {
        this.NombreProductoA = NombreProductoA;
    }

    /**
     * @return the PrecioA
     */
    public double getPrecioA() {
        return PrecioA;
    }

    /**
     * @param PrecioA the PrecioA to set
     */
    public void setPrecioA(double PrecioA) {
        this.PrecioA = PrecioA;
    }

    /**
     * @return the CantidadA
     */
    public int getCantidadA() {
        return CantidadA;
    }

    /**
     * @param CantidadA the CantidadA to set
     */
    public void setCantidadA(int CantidadA) {
        this.CantidadA = CantidadA;
    }

    /**
     * @return the TotalPagar
     */
    public double getTotalPagar() {
        return TotalPagar;
    }

    /**
     * @param TotalPagar the TotalPagar to set
     */
    public void setTotalPagar(double TotalPagar) {
        this.TotalPagar = TotalPagar;
    }

}
