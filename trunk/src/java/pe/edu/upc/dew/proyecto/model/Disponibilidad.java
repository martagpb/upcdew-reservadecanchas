package pe.edu.upc.dew.proyecto.model;


import java.util.Date;


public class Disponibilidad {

    private String fechaDisponible;
    private Cancha mCancha;


    public Disponibilidad () {
    }

    public String getFechaDisponible () {
        return fechaDisponible;
    }

    public void setFechaDisponible (String val) {
        this.fechaDisponible = val;
    }



    public Cancha getCancha () {
        return mCancha;
    }

    public void setCancha (Cancha val) {
        this.mCancha = val;
    }

}

