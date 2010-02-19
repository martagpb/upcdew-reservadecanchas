package pe.edu.upc.dew.proyecto.model;


import java.util.Date;


public class Disponibilidad {

    private Date fechaDisponible;

    private int horaInicio;

    private int horaFin;

    private Cancha mCancha;


    public Disponibilidad () {
    }

    public Date getFechaDisponible () {
        return fechaDisponible;
    }

    public void setFechaDisponible (Date val) {
        this.fechaDisponible = val;
    }

    public int getHoraFin () {
        return horaFin;
    }

    public void setHoraFin (int val) {
        this.horaFin = val;
    }

    public int getHoraInicio () {
        return horaInicio;
    }

    public void setHoraInicio (int val) {
        this.horaInicio = val;
    }

    public Cancha getCancha () {
        return mCancha;
    }

    public void setCancha (Cancha val) {
        this.mCancha = val;
    }

}

