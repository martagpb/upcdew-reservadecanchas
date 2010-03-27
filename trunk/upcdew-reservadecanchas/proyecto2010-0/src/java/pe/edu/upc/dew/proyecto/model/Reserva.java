package pe.edu.upc.dew.proyecto.model;

import java.util.Date;

public class Reserva {

    private int codReserva;
    private Date fechaReserva;
    private int horaInicio;
    private int horaFin;
    private int nroPersonas;
    private double montoPagar;
    private int estado;
    private Usuario mUsuario;
    private Cancha mCancha;

    public Reserva() {
    }

    public int getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(int val) {
        this.codReserva = val;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int val) {
        this.estado = val;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date val) {
        this.fechaReserva = val;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int val) {
        this.horaFin = val;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int val) {
        this.horaInicio = val;
    }

    public double getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(double val) {
        this.montoPagar = val;
    }

    public Usuario getUsuario() {
        return mUsuario;
    }

    public void setUsuario(Usuario val) {
        this.mUsuario = val;
    }

    public Cancha getCancha() {
        return mCancha;
    }

    public void setCancha(Cancha val) {
        this.mCancha = val;
    }

    public int getNroPersonas() {
        return nroPersonas;
    }

    public void setNroPersonas(int val) {
        this.nroPersonas = val;
    }
}

