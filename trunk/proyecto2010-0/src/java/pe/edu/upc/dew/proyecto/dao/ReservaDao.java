/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Reserva;

/**
 *
 * @author usuario
 */
public class ReservaDao {

    private CanchaDao canchaDao;

    public List<Reserva> obtenerReservas() {

        Date myDate = null;
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        try {
            myDate = dateFormat.parse("18/02/2010");
        } catch (ParseException e) {
            e.printStackTrace();
        }


        List<Cancha> canchas = canchaDao.obtenerCanchas();
        List<Reserva> canchasReservadas = new ArrayList<Reserva>();

        Reserva canchaReservada = new Reserva();
        canchaReservada.setCodReserva(1);
        canchaReservada.setEstado(1);
        canchaReservada.setFechaReserva(myDate);
        canchaReservada.setHoraInicio(8);
        canchaReservada.setHoraFin(10);
        canchaReservada.setMontoPagar(80.0);
        canchaReservada.setCancha(canchas.get(6));
        canchaReservada.setNroPersonas(20);


        canchasReservadas.add(canchaReservada);

        Reserva canchaReservada2 = new Reserva();
        canchaReservada2.setCodReserva(2);
        canchaReservada2.setEstado(1);
        canchaReservada2.setFechaReserva(myDate);
        canchaReservada2.setHoraInicio(8);
        canchaReservada2.setHoraFin(10);
        canchaReservada2.setMontoPagar(80.0);
        canchaReservada2.setNroPersonas(20);
        canchaReservada2.setCancha(canchas.get(8));
        canchasReservadas.add(canchaReservada); 


        return canchasReservadas;
    }
}
