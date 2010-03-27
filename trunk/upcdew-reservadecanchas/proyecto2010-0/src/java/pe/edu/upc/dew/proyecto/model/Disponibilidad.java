package pe.edu.upc.dew.proyecto.model;


import java.util.Date;


public class Disponibilidad {

    private Date fechaDisponible;
    private Cancha mCancha;


    public Disponibilidad () {
    }

    public Date getFechaDisponible () {
        return fechaDisponible;
    }

    public void setFechaDisponible (Date val) {
        this.fechaDisponible = val;
    }



    public Cancha getCancha () {
        return mCancha;
    }

    public void setCancha (Cancha val) {
        this.mCancha = val;
    }

}

