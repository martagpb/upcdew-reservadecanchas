package pe.edu.upc.dew.proyecto.model;


public class Cancha {

    private int codCancha;

    private String descripcion;

    private String tipoCesped;

    private String tamano;

    private double costoHora;

    private int estado;


    public Cancha () {
    }

    public int getCodCancha () {
        return codCancha;
    }

    public void setCodCancha (int val) {
        this.codCancha = val;
    }

    public double getCostoHora () {
        return costoHora;
    }

    public void setCostoHora (double val) {
        this.costoHora = val;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String val) {
        this.descripcion = val;
    }

    public int getEstado () {
        return estado;
    }

    public void setEstado (int val) {
        this.estado = val;
    }

    public String getTamano () {
        return tamano;
    }

    public void setTamano (String val) {
        this.tamano = val;
    }

    public String getTipoCesped () {
        return tipoCesped;
    }

    public void setTipoCesped (String val) {
        this.tipoCesped = val;
    }

}

