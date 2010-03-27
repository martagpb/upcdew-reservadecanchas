/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.dao;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.proyecto.model.Calendario;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Dia;
import pe.edu.upc.dew.proyecto.model.Hora;

/**
 *
 * @author usuario
 */
public interface CanchaDao {

 

    public Cancha obtenerCancha(int codigo);
    public List<Cancha> obtenerCanchasDisponibles(String fecha);
    public List<Calendario> obtenerCalendario(int codcancha, String fecha);
    public List<Hora> obtenerHoras();
    public List<Dia> obtenerDias(String fecha);

}
