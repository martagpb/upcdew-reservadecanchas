/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import pe.edu.upc.dew.proyecto.model.Calendario;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Dia;

/**
 *
 * @author usuario
 */
public class CanchaDaoImpl implements CanchaDao {

    private Logger logger = Logger.getLogger(CanchaDaoImpl.class);

    public ArrayList<Calendario> llenarDatos() {
        ArrayList<Calendario> lista = new ArrayList();
        Calendario cal = new Calendario();
        cal.setEstado("No Disponible");
        cal.setFecha("17/02/2010");
        cal.setHora(8);
        lista.add(cal);
        Calendario cal1 = new Calendario();
        cal1.setEstado("No Disponible");
        cal1.setFecha("17/02/2010");
        cal1.setHora(9);
        lista.add(cal1);
        Calendario cal2 = new Calendario();
        cal2.setEstado("No Disponible");
        cal2.setFecha("19/02/2010");
        cal2.setHora(13);
        lista.add(cal2);

        Calendario cal3 = new Calendario();
        cal3.setEstado("No Disponible");
        cal3.setFecha("19/02/2010");
        cal3.setHora(18);
        lista.add(cal3);
        return lista;
    }

    public ArrayList<Dia> llenarCabeceraCalendario() {
        ArrayList<Dia> lista = new ArrayList();
        Dia d = new Dia();
        d.setDia("Sabado");
        d.setFecha("18/02/2010");
        lista.add(d);

        Dia d1 = new Dia();
        d1.setDia("Domingo");
        d1.setFecha("19/02/2010");
        lista.add(d1);

        Dia d2 = new Dia();
        d2.setDia("Lunes");
        d2.setFecha("20/02/2010");
        lista.add(d2);

        Dia d3 = new Dia();
        d3.setDia("Martes");
        d3.setFecha("21/02/2010");
        lista.add(d3);

        Dia d4 = new Dia();
        d4.setDia("Miercoles");
        d4.setFecha("22/02/2010");
        lista.add(d4);

        Dia d5 = new Dia();
        d5.setDia("Jueves");
        d5.setFecha("23/02/2010");
        lista.add(d5);

        Dia d6 = new Dia();
        d6.setDia("Viernes");
        d6.setFecha("24/02/2010");
        lista.add(d6);

        return lista;
    }

    public List<Cancha> obtenerCanchas() {
        logger.debug("Inicio getCanchas");
        List<Cancha> canchas = new ArrayList<Cancha>();

        Cancha cancha1 = new Cancha();
        cancha1.setCodCancha(1);
        cancha1.setDescripcion("Cancha A");
        cancha1.setTipoCesped("Natural");
        cancha1.setCostoHora(80.00);
        cancha1.setTamano("Grande");
        cancha1.setEstado(1);
        cancha1.setListCalendario(llenarDatos());
        cancha1.setListDias(llenarCabeceraCalendario());
        canchas.add(cancha1);

        Cancha cancha2 = new Cancha();
        cancha2.setCodCancha(2);
        cancha2.setDescripcion("Cancha B");
        cancha2.setTipoCesped("Natural");
        cancha2.setCostoHora(70.00);
        cancha2.setTamano("Grande");
        cancha2.setEstado(1);
        cancha2.setListCalendario(llenarDatos());
        cancha2.setListDias(llenarCabeceraCalendario());
        canchas.add(cancha2);


        Cancha cancha3 = new Cancha();
        cancha3.setCodCancha(3);
        cancha3.setDescripcion("Cancha C");
        cancha3.setTipoCesped("Artificial");
        cancha3.setCostoHora(90.00);
        cancha3.setTamano("Mediana");
        cancha3.setEstado(1);
        cancha3.setListCalendario(llenarDatos());
        cancha3.setListDias(llenarCabeceraCalendario());
        canchas.add(cancha3);

        Cancha cancha4 = new Cancha();
        cancha4.setCodCancha(4);
        cancha4.setDescripcion("Cancha D");
        cancha4.setTipoCesped("Artificial");
        cancha4.setCostoHora(100.00);
        cancha4.setTamano("Grande");
        cancha4.setEstado(1);
        cancha4.setListCalendario(llenarDatos());
        cancha4.setListDias(llenarCabeceraCalendario());
        canchas.add(cancha4);


        Cancha cancha5 = new Cancha();
        cancha5.setCodCancha(5);
        cancha5.setDescripcion("Cancha D");
        cancha5.setTipoCesped("Artificial");
        cancha5.setCostoHora(100.00);
        cancha5.setTamano("Grande");
        cancha5.setEstado(1);
        cancha5.setListCalendario(llenarDatos());
        cancha5.setListDias(llenarCabeceraCalendario());
        canchas.add(cancha5);

        Cancha cancha6 = new Cancha();
        cancha6.setCodCancha(6);
        cancha6.setDescripcion("Cancha D");
        cancha6.setTipoCesped("Artificial");
        cancha6.setCostoHora(100.00);
        cancha6.setTamano("Grande");
        cancha6.setEstado(1);
        cancha6.setListCalendario(llenarDatos());
        cancha6.setListDias(llenarCabeceraCalendario());
        canchas.add(cancha6);

        Cancha cancha7 = new Cancha();
        cancha7.setCodCancha(7);
        cancha7.setDescripcion("Cancha E");
        cancha7.setTipoCesped("Artificial");
        cancha7.setCostoHora(150.00);
        cancha7.setTamano("Mediano");
        cancha7.setEstado(1);
        cancha7.setListCalendario(llenarDatos());
        cancha7.setListDias(llenarCabeceraCalendario());
        canchas.add(cancha7);

        Cancha cancha8 = new Cancha();
        cancha8.setCodCancha(8);
        cancha8.setDescripcion("Cancha F");
        cancha8.setTipoCesped("Natural");
        cancha8.setCostoHora(115.00);
        cancha8.setTamano("Pequeño");
        cancha8.setListCalendario(llenarDatos());
        cancha8.setListDias(llenarCabeceraCalendario());
        cancha8.setEstado(1);

        canchas.add(cancha8);

        Cancha cancha9 = new Cancha();
        cancha9.setCodCancha(9);
        cancha9.setDescripcion("Cancha G");
        cancha9.setTipoCesped("Natural");
        cancha9.setCostoHora(90.00);
        cancha9.setTamano("Mediano");
        cancha9.setListCalendario(llenarDatos());
        cancha9.setListDias(llenarCabeceraCalendario());
        cancha9.setEstado(1);

        canchas.add(cancha9);

        Cancha cancha10 = new Cancha();
        cancha10.setCodCancha(10);
        cancha10.setDescripcion("Cancha H");
        cancha10.setTipoCesped("Artificial");
        cancha10.setCostoHora(140.00);
        cancha10.setTamano("Grande");
        cancha10.setEstado(1);

        canchas.add(cancha10);



        return canchas;
    }
}
