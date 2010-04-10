/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.model;

import java.util.Date;

/**
 *
 * @author T13087
 */
public class Reporte {
    private int codCancha;
    private String descripcion;
    private String tipoCesped;
    private Double costoHora;
    private int nroReservas;
    
    public Reporte() {
    }

    public int getCodCancha() {
        return codCancha;
    }

    public void setCodCancha(int val) {
        this.codCancha = val;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String val) {
        this.descripcion = val;
    }
    public String getTipoCesped() {
        return tipoCesped;
    }

    public void setTipoCesped(String val) {
        this.tipoCesped = val;
    }
    public int getNroReservas() {
        return nroReservas;
    }
    public void setNroReservas(int val) {
        this.nroReservas = val;
    }
    public Double getCostoHora() {
        return costoHora;
    }
    public void setCostoHora(double val) {
        this.costoHora = val;
    }
}
