/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.dao;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.proyecto.model.Calendario;
import pe.edu.upc.dew.proyecto.model.Cancha;

/**
 *
 * @author luigi
 */
public class CalendarioDao {

   private CanchaDao canchaDao;
 public CalendarioDao() {
        this.canchaDao = new CanchaDao();
    }

    public Cancha obtenerCalendario(String nomCancha, String fecha) {
        List<Cancha> canchas = canchaDao.obtenerCanchas();
        Cancha cancha = new Cancha();
        for (int i =0 ; i< canchas.size();i++){
            Cancha c =(Cancha)canchas.get(i);
                if (c.getDescripcion().equalsIgnoreCase(nomCancha))
                    cancha=c;

        }

        return cancha;
    }


}
