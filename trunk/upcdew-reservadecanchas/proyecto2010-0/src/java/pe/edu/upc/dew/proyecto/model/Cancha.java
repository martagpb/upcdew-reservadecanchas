package pe.edu.upc.dew.proyecto.model;

import java.util.List;

public class Cancha {

    private int codCancha;
    private String descripcion;
    private String tipoCesped;
    private String tamano;
    private double costoHora;
    private int estado;
    private List<Calendario> listCalendario;

    public void setListCalendario(List<Calendario> listCalendario) {
        this.listCalendario = listCalendario;
    }

    public void setListDias(List<Dia> listDias) {
        this.listDias = listDias;
    }

    public List<Calendario> getListCalendario() {
        return listCalendario;
    }

    public List<Dia> getListDias() {
        return listDias;
    }
    private List<Dia> listDias;

    public Cancha() {
    }

    public int getCodCancha() {
        return codCancha;
    }

    public void setCodCancha(int val) {
        this.codCancha = val;
    }

    public double getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(double val) {
        this.costoHora = val;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String val) {
        this.descripcion = val;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int val) {
        this.estado = val;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String val) {
        this.tamano = val;
    }

    public String getTipoCesped() {
        return tipoCesped;
    }

    public void setTipoCesped(String val) {
        this.tipoCesped = val;
    }

    public String obtenerDisponibilidad(String fecha, int hora) {
        for (int i = 0; i < listCalendario.size(); i++) {
            Calendario c = (Calendario) listCalendario.get(i);
            if (c.getFecha().equals(fecha) && c.getHora() == hora) {
                return "Reservado";
            }
        }
        return "Disponible";
    }
}

