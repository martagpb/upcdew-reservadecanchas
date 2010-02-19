/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Disponibilidad;

/**
 *
 * @author Marco Antonio
 */
public class DisponibilidadDao {

    private CanchaDao canchaDao;

    public DisponibilidadDao() {
        this.canchaDao = new CanchaDao();
    }

    private List<Disponibilidad> llenarDatos(){
        Date myDate = null;
        Date myDate1 = null;
        Date myDate2 = null;
        Date myDate3 = null;
        Date myDate4 = null;
        Date myDate5 = null;
        Date myDate6 = null;
        Date myDate7 = null;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            myDate  = dateFormat.parse("17/02/2010");
            myDate1 = dateFormat.parse("18/02/2010");
            myDate2 = dateFormat.parse("19/02/2010");
            myDate3 = dateFormat.parse("20/02/2010");
            myDate4 = dateFormat.parse("21/02/2010");
            myDate5 = dateFormat.parse("22/02/2010");
            myDate6 = dateFormat.parse("23/02/2010");
            myDate7 = dateFormat.parse("24/02/2010");
        } catch (ParseException e) {
            e.printStackTrace();
        }
         List<Cancha> canchas = canchaDao.obtenerCanchas();
        List<Disponibilidad> canchasDisponibles = new ArrayList<Disponibilidad>();

        // Fecha 17/02/2009

        Disponibilidad canchaDisponible10 = new Disponibilidad();
        canchaDisponible10.setFechaDisponible(myDate);
        canchaDisponible10.setHoraInicio(8);
        canchaDisponible10.setHoraFin(10);
        canchaDisponible10.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible10);

        Disponibilidad canchaDisponible11 = new Disponibilidad();
        canchaDisponible11.setFechaDisponible(myDate);
        canchaDisponible11.setHoraInicio(10);
        canchaDisponible11.setHoraFin(12);
        canchaDisponible11.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible11);

        Disponibilidad canchaDisponible12 = new Disponibilidad();
        canchaDisponible12.setFechaDisponible(myDate);
        canchaDisponible12.setHoraInicio(12);
        canchaDisponible12.setHoraFin(14);
        canchaDisponible12.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible12);

        Disponibilidad canchaDisponible13 = new Disponibilidad();
        canchaDisponible13.setFechaDisponible(myDate);
        canchaDisponible13.setHoraInicio(16);
        canchaDisponible13.setHoraFin(18);
        canchaDisponible13.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible13);
        //----
        Disponibilidad canchaDisponible14 = new Disponibilidad();
        canchaDisponible14.setFechaDisponible(myDate);
        canchaDisponible14.setHoraInicio(8);
        canchaDisponible14.setHoraFin(10);
        canchaDisponible14.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible14);

        Disponibilidad canchaDisponible15 = new Disponibilidad();
        canchaDisponible15.setFechaDisponible(myDate);
        canchaDisponible15.setHoraInicio(10);
        canchaDisponible15.setHoraFin(12);
        canchaDisponible15.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible15);

        Disponibilidad canchaDisponible16 = new Disponibilidad();
        canchaDisponible16.setFechaDisponible(myDate);
        canchaDisponible16.setHoraInicio(12);
        canchaDisponible16.setHoraFin(14);
        canchaDisponible16.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible16);

        Disponibilidad canchaDisponible17 = new Disponibilidad();
        canchaDisponible17.setFechaDisponible(myDate);
        canchaDisponible17.setHoraInicio(14);
        canchaDisponible17.setHoraFin(16);
        canchaDisponible17.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible17);

        Disponibilidad canchaDisponible18 = new Disponibilidad();
        canchaDisponible18.setFechaDisponible(myDate);
        canchaDisponible18.setHoraInicio(16);
        canchaDisponible18.setHoraFin(18);
        canchaDisponible18.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible18);
        //----
        Disponibilidad canchaDisponible = new Disponibilidad();
        canchaDisponible.setFechaDisponible(myDate);
        canchaDisponible.setHoraInicio(8);
        canchaDisponible.setHoraFin(10);
        canchaDisponible.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible);

        Disponibilidad canchaDisponible4 = new Disponibilidad();
        canchaDisponible4.setFechaDisponible(myDate);
        canchaDisponible4.setHoraInicio(10);
        canchaDisponible4.setHoraFin(12);
        canchaDisponible4.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible4);

        Disponibilidad canchaDisponible6 = new Disponibilidad();
        canchaDisponible6.setFechaDisponible(myDate);
        canchaDisponible6.setHoraInicio(14);
        canchaDisponible6.setHoraFin(16);
        canchaDisponible6.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible6);

        Disponibilidad canchaDisponible7 = new Disponibilidad();
        canchaDisponible7.setFechaDisponible(myDate);
        canchaDisponible7.setHoraInicio(16);
        canchaDisponible7.setHoraFin(18);
        canchaDisponible7.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible7);
        //----
        Disponibilidad canchaDisponible5 = new Disponibilidad();
        canchaDisponible5.setFechaDisponible(myDate);
        canchaDisponible5.setHoraInicio(8);
        canchaDisponible5.setHoraFin(10);
        canchaDisponible5.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible5);

        Disponibilidad canchaDisponible8 = new Disponibilidad();
        canchaDisponible8.setFechaDisponible(myDate);
        canchaDisponible8.setHoraInicio(12);
        canchaDisponible8.setHoraFin(14);
        canchaDisponible8.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible8);

        Disponibilidad canchaDisponible3 = new Disponibilidad();
        canchaDisponible3.setFechaDisponible(myDate);
        canchaDisponible3.setHoraInicio(14);
        canchaDisponible3.setHoraFin(16);
        canchaDisponible3.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible3);

        Disponibilidad canchaDisponible9 = new Disponibilidad();
        canchaDisponible9.setFechaDisponible(myDate);
        canchaDisponible9.setHoraInicio(16);
        canchaDisponible9.setHoraFin(18);
        canchaDisponible9.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible9);

        // Fecha 18/02/2009

        Disponibilidad canchaDisponible2 = new Disponibilidad();
        canchaDisponible2.setFechaDisponible(myDate1);
        canchaDisponible2.setHoraInicio(8);
        canchaDisponible2.setHoraFin(10);
        canchaDisponible2.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible2);

        Disponibilidad canchaDisponible19 = new Disponibilidad();
        canchaDisponible19.setFechaDisponible(myDate1);
        canchaDisponible19.setHoraInicio(10);
        canchaDisponible19.setHoraFin(12);
        canchaDisponible19.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible19);

        Disponibilidad canchaDisponible20 = new Disponibilidad();
        canchaDisponible20.setFechaDisponible(myDate1);
        canchaDisponible20.setHoraInicio(12);
        canchaDisponible20.setHoraFin(14);
        canchaDisponible20.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible20);

        Disponibilidad canchaDisponible21 = new Disponibilidad();
        canchaDisponible21.setFechaDisponible(myDate1);
        canchaDisponible21.setHoraInicio(14);
        canchaDisponible21.setHoraFin(16);
        canchaDisponible21.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible21);

        Disponibilidad canchaDisponible22 = new Disponibilidad();
        canchaDisponible22.setFechaDisponible(myDate1);
        canchaDisponible22.setHoraInicio(16);
        canchaDisponible22.setHoraFin(18);
        canchaDisponible22.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible22);
        //----
        Disponibilidad canchaDisponible23 = new Disponibilidad();
        canchaDisponible23.setFechaDisponible(myDate1);
        canchaDisponible23.setHoraInicio(8);
        canchaDisponible23.setHoraFin(10);
        canchaDisponible23.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible23);

        Disponibilidad canchaDisponible24 = new Disponibilidad();
        canchaDisponible24.setFechaDisponible(myDate1);
        canchaDisponible24.setHoraInicio(10);
        canchaDisponible24.setHoraFin(12);
        canchaDisponible24.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible24);

        Disponibilidad canchaDisponible25 = new Disponibilidad();
        canchaDisponible25.setFechaDisponible(myDate1);
        canchaDisponible25.setHoraInicio(12);
        canchaDisponible25.setHoraFin(14);
        canchaDisponible25.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible25);

        Disponibilidad canchaDisponible26 = new Disponibilidad();
        canchaDisponible26.setFechaDisponible(myDate1);
        canchaDisponible26.setHoraInicio(14);
        canchaDisponible26.setHoraFin(16);
        canchaDisponible26.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible26);

        Disponibilidad canchaDisponible27 = new Disponibilidad();
        canchaDisponible27.setFechaDisponible(myDate1);
        canchaDisponible27.setHoraInicio(16);
        canchaDisponible27.setHoraFin(18);
        canchaDisponible27.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible27);
        //----
        Disponibilidad canchaDisponible28 = new Disponibilidad();
        canchaDisponible28.setFechaDisponible(myDate1);
        canchaDisponible28.setHoraInicio(8);
        canchaDisponible28.setHoraFin(10);
        canchaDisponible28.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible28);

        Disponibilidad canchaDisponible29 = new Disponibilidad();
        canchaDisponible29.setFechaDisponible(myDate1);
        canchaDisponible29.setHoraInicio(10);
        canchaDisponible29.setHoraFin(12);
        canchaDisponible29.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible29);

        Disponibilidad canchaDisponible30 = new Disponibilidad();
        canchaDisponible30.setFechaDisponible(myDate1);
        canchaDisponible30.setHoraInicio(14);
        canchaDisponible30.setHoraFin(16);
        canchaDisponible30.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible30);

        Disponibilidad canchaDisponible31 = new Disponibilidad();
        canchaDisponible31.setFechaDisponible(myDate1);
        canchaDisponible31.setHoraInicio(16);
        canchaDisponible31.setHoraFin(18);
        canchaDisponible31.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible31);
        //----
        Disponibilidad canchaDisponible32 = new Disponibilidad();
        canchaDisponible32.setFechaDisponible(myDate1);
        canchaDisponible32.setHoraInicio(8);
        canchaDisponible32.setHoraFin(10);
        canchaDisponible32.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible32);

        Disponibilidad canchaDisponible33 = new Disponibilidad();
        canchaDisponible33.setFechaDisponible(myDate1);
        canchaDisponible33.setHoraInicio(12);
        canchaDisponible33.setHoraFin(14);
        canchaDisponible33.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible33);

        Disponibilidad canchaDisponible34 = new Disponibilidad();
        canchaDisponible34.setFechaDisponible(myDate1);
        canchaDisponible34.setHoraInicio(14);
        canchaDisponible34.setHoraFin(16);
        canchaDisponible34.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible34);

        Disponibilidad canchaDisponible35 = new Disponibilidad();
        canchaDisponible35.setFechaDisponible(myDate1);
        canchaDisponible35.setHoraInicio(16);
        canchaDisponible35.setHoraFin(18);
        canchaDisponible35.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible35);

        // Fecha 19/02/2009

        Disponibilidad canchaDisponible36 = new Disponibilidad();
        canchaDisponible36.setFechaDisponible(myDate2);
        canchaDisponible36.setHoraInicio(8);
        canchaDisponible36.setHoraFin(10);
        canchaDisponible36.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible36);

        Disponibilidad canchaDisponible37 = new Disponibilidad();
        canchaDisponible37.setFechaDisponible(myDate2);
        canchaDisponible37.setHoraInicio(10);
        canchaDisponible37.setHoraFin(12);
        canchaDisponible37.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible37);

        Disponibilidad canchaDisponible38 = new Disponibilidad();
        canchaDisponible38.setFechaDisponible(myDate2);
        canchaDisponible38.setHoraInicio(12);
        canchaDisponible38.setHoraFin(14);
        canchaDisponible38.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible38);

        Disponibilidad canchaDisponible39 = new Disponibilidad();
        canchaDisponible39.setFechaDisponible(myDate2);
        canchaDisponible39.setHoraInicio(14);
        canchaDisponible39.setHoraFin(16);
        canchaDisponible39.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible39);

        Disponibilidad canchaDisponible40 = new Disponibilidad();
        canchaDisponible40.setFechaDisponible(myDate2);
        canchaDisponible40.setHoraInicio(16);
        canchaDisponible40.setHoraFin(18);
        canchaDisponible40.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible40);
        //----
        Disponibilidad canchaDisponible41 = new Disponibilidad();
        canchaDisponible41.setFechaDisponible(myDate2);
        canchaDisponible41.setHoraInicio(8);
        canchaDisponible41.setHoraFin(10);
        canchaDisponible41.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible41);

        Disponibilidad canchaDisponible42 = new Disponibilidad();
        canchaDisponible42.setFechaDisponible(myDate2);
        canchaDisponible42.setHoraInicio(10);
        canchaDisponible42.setHoraFin(12);
        canchaDisponible42.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible42);

        Disponibilidad canchaDisponible43 = new Disponibilidad();
        canchaDisponible43.setFechaDisponible(myDate2);
        canchaDisponible43.setHoraInicio(12);
        canchaDisponible43.setHoraFin(14);
        canchaDisponible43.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible43);

        Disponibilidad canchaDisponible44 = new Disponibilidad();
        canchaDisponible44.setFechaDisponible(myDate2);
        canchaDisponible44.setHoraInicio(14);
        canchaDisponible44.setHoraFin(16);
        canchaDisponible44.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible44);

        Disponibilidad canchaDisponible45 = new Disponibilidad();
        canchaDisponible45.setFechaDisponible(myDate2);
        canchaDisponible45.setHoraInicio(16);
        canchaDisponible45.setHoraFin(18);
        canchaDisponible45.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible45);
        //----
        Disponibilidad canchaDisponible46 = new Disponibilidad();
        canchaDisponible46.setFechaDisponible(myDate2);
        canchaDisponible46.setHoraInicio(8);
        canchaDisponible46.setHoraFin(10);
        canchaDisponible46.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible46);

        Disponibilidad canchaDisponible47 = new Disponibilidad();
        canchaDisponible47.setFechaDisponible(myDate2);
        canchaDisponible47.setHoraInicio(10);
        canchaDisponible47.setHoraFin(12);
        canchaDisponible47.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible47);

        Disponibilidad canchaDisponible48 = new Disponibilidad();
        canchaDisponible48.setFechaDisponible(myDate2);
        canchaDisponible48.setHoraInicio(14);
        canchaDisponible48.setHoraFin(16);
        canchaDisponible48.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible48);

        Disponibilidad canchaDisponible49 = new Disponibilidad();
        canchaDisponible49.setFechaDisponible(myDate2);
        canchaDisponible49.setHoraInicio(16);
        canchaDisponible49.setHoraFin(18);
        canchaDisponible49.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible49);
        //----
        Disponibilidad canchaDisponible50 = new Disponibilidad();
        canchaDisponible50.setFechaDisponible(myDate2);
        canchaDisponible50.setHoraInicio(8);
        canchaDisponible50.setHoraFin(10);
        canchaDisponible50.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible50);

        Disponibilidad canchaDisponible51 = new Disponibilidad();
        canchaDisponible51.setFechaDisponible(myDate2);
        canchaDisponible51.setHoraInicio(12);
        canchaDisponible51.setHoraFin(14);
        canchaDisponible51.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible51);

        Disponibilidad canchaDisponible52 = new Disponibilidad();
        canchaDisponible52.setFechaDisponible(myDate2);
        canchaDisponible52.setHoraInicio(14);
        canchaDisponible52.setHoraFin(16);
        canchaDisponible52.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible52);

        Disponibilidad canchaDisponible53 = new Disponibilidad();
        canchaDisponible53.setFechaDisponible(myDate2);
        canchaDisponible53.setHoraInicio(16);
        canchaDisponible53.setHoraFin(18);
        canchaDisponible53.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible53);

       // Fecha 20/02/2009

        Disponibilidad canchaDisponible54 = new Disponibilidad();
        canchaDisponible54.setFechaDisponible(myDate3);
        canchaDisponible54.setHoraInicio(8);
        canchaDisponible54.setHoraFin(10);
        canchaDisponible54.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible54);
        /**
        Disponibilidad canchaDisponible55 = new Disponibilidad();
        canchaDisponible55.setFechaDisponible(myDate3);
        canchaDisponible55.setHoraInicio(10);
        canchaDisponible55.setHoraFin(12);
        canchaDisponible55.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible55);

        Disponibilidad canchaDisponible56 = new Disponibilidad();
        canchaDisponible56.setFechaDisponible(myDate3);
        canchaDisponible56.setHoraInicio(12);
        canchaDisponible56.setHoraFin(14);
        canchaDisponible56.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible56);

        Disponibilidad canchaDisponible57 = new Disponibilidad();
        canchaDisponible57.setFechaDisponible(myDate3);
        canchaDisponible57.setHoraInicio(14);
        canchaDisponible57.setHoraFin(16);
        canchaDisponible57.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible57);
        */
        Disponibilidad canchaDisponible58 = new Disponibilidad();
        canchaDisponible58.setFechaDisponible(myDate3);
        canchaDisponible58.setHoraInicio(16);
        canchaDisponible58.setHoraFin(18);
        canchaDisponible58.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible58);
        //----
        Disponibilidad canchaDisponible59 = new Disponibilidad();
        canchaDisponible59.setFechaDisponible(myDate3);
        canchaDisponible59.setHoraInicio(8);
        canchaDisponible59.setHoraFin(10);
        canchaDisponible59.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible59);

        Disponibilidad canchaDisponible60 = new Disponibilidad();
        canchaDisponible60.setFechaDisponible(myDate3);
        canchaDisponible60.setHoraInicio(10);
        canchaDisponible60.setHoraFin(12);
        canchaDisponible60.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible60);
        /**
        Disponibilidad canchaDisponible61 = new Disponibilidad();
        canchaDisponible61.setFechaDisponible(myDate3);
        canchaDisponible61.setHoraInicio(12);
        canchaDisponible61.setHoraFin(14);
        canchaDisponible61.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible61);
        */
        Disponibilidad canchaDisponible62 = new Disponibilidad();
        canchaDisponible62.setFechaDisponible(myDate3);
        canchaDisponible62.setHoraInicio(14);
        canchaDisponible62.setHoraFin(16);
        canchaDisponible62.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible62);

        Disponibilidad canchaDisponible63 = new Disponibilidad();
        canchaDisponible63.setFechaDisponible(myDate3);
        canchaDisponible63.setHoraInicio(16);
        canchaDisponible63.setHoraFin(18);
        canchaDisponible63.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible63);
        /**
        Disponibilidad canchaDisponible64 = new Disponibilidad();
        canchaDisponible64.setFechaDisponible(myDate3);
        canchaDisponible64.setHoraInicio(8);
        canchaDisponible64.setHoraFin(10);
        canchaDisponible64.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible64);

        Disponibilidad canchaDisponible65 = new Disponibilidad();
        canchaDisponible65.setFechaDisponible(myDate3);
        canchaDisponible65.setHoraInicio(10);
        canchaDisponible65.setHoraFin(12);
        canchaDisponible65.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible65);
        */
        Disponibilidad canchaDisponible66 = new Disponibilidad();
        canchaDisponible66.setFechaDisponible(myDate3);
        canchaDisponible66.setHoraInicio(14);
        canchaDisponible66.setHoraFin(16);
        canchaDisponible66.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible66);

        Disponibilidad canchaDisponible67 = new Disponibilidad();
        canchaDisponible67.setFechaDisponible(myDate3);
        canchaDisponible67.setHoraInicio(16);
        canchaDisponible67.setHoraFin(18);
        canchaDisponible67.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible67);
        //----
        Disponibilidad canchaDisponible68 = new Disponibilidad();
        canchaDisponible68.setFechaDisponible(myDate3);
        canchaDisponible68.setHoraInicio(8);
        canchaDisponible68.setHoraFin(10);
        canchaDisponible68.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible68);
        /**
        Disponibilidad canchaDisponible69 = new Disponibilidad();
        canchaDisponible69.setFechaDisponible(myDate3);
        canchaDisponible69.setHoraInicio(12);
        canchaDisponible69.setHoraFin(14);
        canchaDisponible69.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible69);
        */
        Disponibilidad canchaDisponible70 = new Disponibilidad();
        canchaDisponible70.setFechaDisponible(myDate3);
        canchaDisponible70.setHoraInicio(14);
        canchaDisponible70.setHoraFin(16);
        canchaDisponible70.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible70);

        Disponibilidad canchaDisponible71 = new Disponibilidad();
        canchaDisponible71.setFechaDisponible(myDate3);
        canchaDisponible71.setHoraInicio(16);
        canchaDisponible71.setHoraFin(18);
        canchaDisponible71.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible71);

        // Fecha 21/02/2009

        Disponibilidad canchaDisponible72 = new Disponibilidad();
        canchaDisponible72.setFechaDisponible(myDate4);
        canchaDisponible72.setHoraInicio(8);
        canchaDisponible72.setHoraFin(10);
        canchaDisponible72.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible72);

        Disponibilidad canchaDisponible73 = new Disponibilidad();
        canchaDisponible73.setFechaDisponible(myDate4);
        canchaDisponible73.setHoraInicio(10);
        canchaDisponible73.setHoraFin(12);
        canchaDisponible73.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible73);
        /**
        Disponibilidad canchaDisponible74 = new Disponibilidad();
        canchaDisponible74.setFechaDisponible(myDate4);
        canchaDisponible74.setHoraInicio(12);
        canchaDisponible74.setHoraFin(14);
        canchaDisponible74.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible74);

        Disponibilidad canchaDisponible75 = new Disponibilidad();
        canchaDisponible75.setFechaDisponible(myDate4);
        canchaDisponible75.setHoraInicio(14);
        canchaDisponible75.setHoraFin(16);
        canchaDisponible75.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible75);

        Disponibilidad canchaDisponible76 = new Disponibilidad();
        canchaDisponible76.setFechaDisponible(myDate4);
        canchaDisponible76.setHoraInicio(16);
        canchaDisponible76.setHoraFin(18);
        canchaDisponible76.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible76);
        //----
        Disponibilidad canchaDisponible77 = new Disponibilidad();
        canchaDisponible77.setFechaDisponible(myDate4);
        canchaDisponible77.setHoraInicio(8);
        canchaDisponible77.setHoraFin(10);
        canchaDisponible77.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible77);

        Disponibilidad canchaDisponible78 = new Disponibilidad();
        canchaDisponible78.setFechaDisponible(myDate4);
        canchaDisponible78.setHoraInicio(10);
        canchaDisponible78.setHoraFin(12);
        canchaDisponible78.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible78);

        Disponibilidad canchaDisponible79 = new Disponibilidad();
        canchaDisponible79.setFechaDisponible(myDate4);
        canchaDisponible79.setHoraInicio(12);
        canchaDisponible79.setHoraFin(14);
        canchaDisponible79.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible79);
        */
        Disponibilidad canchaDisponible80 = new Disponibilidad();
        canchaDisponible80.setFechaDisponible(myDate4);
        canchaDisponible80.setHoraInicio(14);
        canchaDisponible80.setHoraFin(16);
        canchaDisponible80.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible80);

        Disponibilidad canchaDisponible81 = new Disponibilidad();
        canchaDisponible81.setFechaDisponible(myDate4);
        canchaDisponible81.setHoraInicio(16);
        canchaDisponible81.setHoraFin(18);
        canchaDisponible81.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible81);
        //----
        Disponibilidad canchaDisponible82 = new Disponibilidad();
        canchaDisponible82.setFechaDisponible(myDate4);
        canchaDisponible82.setHoraInicio(8);
        canchaDisponible82.setHoraFin(10);
        canchaDisponible82.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible82);
        /**
        Disponibilidad canchaDisponible83 = new Disponibilidad();
        canchaDisponible83.setFechaDisponible(myDate4);
        canchaDisponible83.setHoraInicio(10);
        canchaDisponible83.setHoraFin(12);
        canchaDisponible83.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible83);

        Disponibilidad canchaDisponible84 = new Disponibilidad();
        canchaDisponible84.setFechaDisponible(myDate4);
        canchaDisponible84.setHoraInicio(14);
        canchaDisponible84.setHoraFin(16);
        canchaDisponible84.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible84);

        Disponibilidad canchaDisponible85 = new Disponibilidad();
        canchaDisponible85.setFechaDisponible(myDate4);
        canchaDisponible85.setHoraInicio(16);
        canchaDisponible85.setHoraFin(18);
        canchaDisponible85.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible85);
        //----
        Disponibilidad canchaDisponible86 = new Disponibilidad();
        canchaDisponible86.setFechaDisponible(myDate4);
        canchaDisponible86.setHoraInicio(8);
        canchaDisponible86.setHoraFin(10);
        canchaDisponible86.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible86);

        Disponibilidad canchaDisponible87 = new Disponibilidad();
        canchaDisponible87.setFechaDisponible(myDate4);
        canchaDisponible87.setHoraInicio(12);
        canchaDisponible87.setHoraFin(14);
        canchaDisponible87.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible87);
        */
        Disponibilidad canchaDisponible88 = new Disponibilidad();
        canchaDisponible88.setFechaDisponible(myDate4);
        canchaDisponible88.setHoraInicio(14);
        canchaDisponible88.setHoraFin(16);
        canchaDisponible88.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible88);

        Disponibilidad canchaDisponible89 = new Disponibilidad();
        canchaDisponible89.setFechaDisponible(myDate4);
        canchaDisponible89.setHoraInicio(16);
        canchaDisponible89.setHoraFin(18);
        canchaDisponible89.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible89);

        // Fecha 22/02/2009

        Disponibilidad canchaDisponible90 = new Disponibilidad();
        canchaDisponible90.setFechaDisponible(myDate5);
        canchaDisponible90.setHoraInicio(8);
        canchaDisponible90.setHoraFin(10);
        canchaDisponible90.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible90);

        Disponibilidad canchaDisponible91 = new Disponibilidad();
        canchaDisponible91.setFechaDisponible(myDate5);
        canchaDisponible91.setHoraInicio(10);
        canchaDisponible91.setHoraFin(12);
        canchaDisponible91.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible91);

        Disponibilidad canchaDisponible92 = new Disponibilidad();
        canchaDisponible92.setFechaDisponible(myDate5);
        canchaDisponible92.setHoraInicio(12);
        canchaDisponible92.setHoraFin(14);
        canchaDisponible92.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible92);

        Disponibilidad canchaDisponible93 = new Disponibilidad();
        canchaDisponible93.setFechaDisponible(myDate5);
        canchaDisponible93.setHoraInicio(14);
        canchaDisponible93.setHoraFin(16);
        canchaDisponible93.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible93);

        Disponibilidad canchaDisponible94 = new Disponibilidad();
        canchaDisponible94.setFechaDisponible(myDate5);
        canchaDisponible94.setHoraInicio(16);
        canchaDisponible94.setHoraFin(18);
        canchaDisponible94.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible94);
        //----
        Disponibilidad canchaDisponible95 = new Disponibilidad();
        canchaDisponible95.setFechaDisponible(myDate5);
        canchaDisponible95.setHoraInicio(8);
        canchaDisponible95.setHoraFin(10);
        canchaDisponible95.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible95);

        Disponibilidad canchaDisponible96 = new Disponibilidad();
        canchaDisponible96.setFechaDisponible(myDate5);
        canchaDisponible96.setHoraInicio(10);
        canchaDisponible96.setHoraFin(12);
        canchaDisponible96.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible96);

        Disponibilidad canchaDisponible97 = new Disponibilidad();
        canchaDisponible97.setFechaDisponible(myDate5);
        canchaDisponible97.setHoraInicio(12);
        canchaDisponible97.setHoraFin(14);
        canchaDisponible97.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible97);

        Disponibilidad canchaDisponible98 = new Disponibilidad();
        canchaDisponible98.setFechaDisponible(myDate5);
        canchaDisponible98.setHoraInicio(14);
        canchaDisponible98.setHoraFin(16);
        canchaDisponible98.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible98);

        Disponibilidad canchaDisponible99 = new Disponibilidad();
        canchaDisponible99.setFechaDisponible(myDate5);
        canchaDisponible99.setHoraInicio(16);
        canchaDisponible99.setHoraFin(18);
        canchaDisponible99.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible99);
        //----
        Disponibilidad canchaDisponible100 = new Disponibilidad();
        canchaDisponible100.setFechaDisponible(myDate5);
        canchaDisponible100.setHoraInicio(8);
        canchaDisponible100.setHoraFin(10);
        canchaDisponible100.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible100);

        Disponibilidad canchaDisponible101 = new Disponibilidad();
        canchaDisponible101.setFechaDisponible(myDate5);
        canchaDisponible101.setHoraInicio(10);
        canchaDisponible101.setHoraFin(12);
        canchaDisponible101.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible101);

        Disponibilidad canchaDisponible102 = new Disponibilidad();
        canchaDisponible102.setFechaDisponible(myDate5);
        canchaDisponible102.setHoraInicio(14);
        canchaDisponible102.setHoraFin(16);
        canchaDisponible102.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible102);

        Disponibilidad canchaDisponible103 = new Disponibilidad();
        canchaDisponible103.setFechaDisponible(myDate5);
        canchaDisponible103.setHoraInicio(16);
        canchaDisponible103.setHoraFin(18);
        canchaDisponible103.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible103);
        //----
        Disponibilidad canchaDisponible104 = new Disponibilidad();
        canchaDisponible104.setFechaDisponible(myDate5);
        canchaDisponible104.setHoraInicio(8);
        canchaDisponible104.setHoraFin(10);
        canchaDisponible104.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible104);

        Disponibilidad canchaDisponible105 = new Disponibilidad();
        canchaDisponible105.setFechaDisponible(myDate5);
        canchaDisponible105.setHoraInicio(12);
        canchaDisponible105.setHoraFin(14);
        canchaDisponible105.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible105);

        Disponibilidad canchaDisponible106 = new Disponibilidad();
        canchaDisponible106.setFechaDisponible(myDate5);
        canchaDisponible106.setHoraInicio(14);
        canchaDisponible106.setHoraFin(16);
        canchaDisponible106.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible106);

        Disponibilidad canchaDisponible107 = new Disponibilidad();
        canchaDisponible107.setFechaDisponible(myDate5);
        canchaDisponible107.setHoraInicio(16);
        canchaDisponible107.setHoraFin(18);
        canchaDisponible107.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible107);

        // Fecha 23/02/2009

        Disponibilidad canchaDisponible108 = new Disponibilidad();
        canchaDisponible108.setFechaDisponible(myDate6);
        canchaDisponible108.setHoraInicio(8);
        canchaDisponible108.setHoraFin(10);
        canchaDisponible108.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible108);

        Disponibilidad canchaDisponible109 = new Disponibilidad();
        canchaDisponible109.setFechaDisponible(myDate6);
        canchaDisponible109.setHoraInicio(10);
        canchaDisponible109.setHoraFin(12);
        canchaDisponible109.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible109);

        Disponibilidad canchaDisponible110 = new Disponibilidad();
        canchaDisponible110.setFechaDisponible(myDate6);
        canchaDisponible110.setHoraInicio(12);
        canchaDisponible110.setHoraFin(14);
        canchaDisponible110.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible110);

        Disponibilidad canchaDisponible111 = new Disponibilidad();
        canchaDisponible111.setFechaDisponible(myDate6);
        canchaDisponible111.setHoraInicio(14);
        canchaDisponible111.setHoraFin(16);
        canchaDisponible111.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible111);

        Disponibilidad canchaDisponible112 = new Disponibilidad();
        canchaDisponible112.setFechaDisponible(myDate6);
        canchaDisponible112.setHoraInicio(16);
        canchaDisponible112.setHoraFin(18);
        canchaDisponible112.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible112);
        //----
        Disponibilidad canchaDisponible113 = new Disponibilidad();
        canchaDisponible113.setFechaDisponible(myDate6);
        canchaDisponible113.setHoraInicio(8);
        canchaDisponible113.setHoraFin(10);
        canchaDisponible113.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible113);

        Disponibilidad canchaDisponible114 = new Disponibilidad();
        canchaDisponible114.setFechaDisponible(myDate6);
        canchaDisponible114.setHoraInicio(10);
        canchaDisponible114.setHoraFin(12);
        canchaDisponible114.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible114);

        Disponibilidad canchaDisponible115 = new Disponibilidad();
        canchaDisponible115.setFechaDisponible(myDate6);
        canchaDisponible115.setHoraInicio(12);
        canchaDisponible115.setHoraFin(14);
        canchaDisponible115.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible115);

        Disponibilidad canchaDisponible116 = new Disponibilidad();
        canchaDisponible116.setFechaDisponible(myDate6);
        canchaDisponible116.setHoraInicio(14);
        canchaDisponible116.setHoraFin(16);
        canchaDisponible116.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible116);

        Disponibilidad canchaDisponible117 = new Disponibilidad();
        canchaDisponible117.setFechaDisponible(myDate6);
        canchaDisponible117.setHoraInicio(16);
        canchaDisponible117.setHoraFin(18);
        canchaDisponible117.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible117);
        //----
        Disponibilidad canchaDisponible118 = new Disponibilidad();
        canchaDisponible118.setFechaDisponible(myDate6);
        canchaDisponible118.setHoraInicio(8);
        canchaDisponible118.setHoraFin(10);
        canchaDisponible118.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible118);

        Disponibilidad canchaDisponible119 = new Disponibilidad();
        canchaDisponible119.setFechaDisponible(myDate6);
        canchaDisponible119.setHoraInicio(10);
        canchaDisponible119.setHoraFin(12);
        canchaDisponible119.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible119);

        Disponibilidad canchaDisponible120 = new Disponibilidad();
        canchaDisponible120.setFechaDisponible(myDate6);
        canchaDisponible120.setHoraInicio(14);
        canchaDisponible120.setHoraFin(16);
        canchaDisponible120.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible120);

        Disponibilidad canchaDisponible121 = new Disponibilidad();
        canchaDisponible121.setFechaDisponible(myDate6);
        canchaDisponible121.setHoraInicio(16);
        canchaDisponible121.setHoraFin(18);
        canchaDisponible121.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible121);
        //----
        Disponibilidad canchaDisponible122 = new Disponibilidad();
        canchaDisponible122.setFechaDisponible(myDate6);
        canchaDisponible122.setHoraInicio(8);
        canchaDisponible122.setHoraFin(10);
        canchaDisponible122.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible122);

        Disponibilidad canchaDisponible123 = new Disponibilidad();
        canchaDisponible123.setFechaDisponible(myDate6);
        canchaDisponible123.setHoraInicio(12);
        canchaDisponible123.setHoraFin(14);
        canchaDisponible123.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible123);

        Disponibilidad canchaDisponible124 = new Disponibilidad();
        canchaDisponible124.setFechaDisponible(myDate6);
        canchaDisponible124.setHoraInicio(14);
        canchaDisponible124.setHoraFin(16);
        canchaDisponible124.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible124);

        Disponibilidad canchaDisponible125 = new Disponibilidad();
        canchaDisponible125.setFechaDisponible(myDate6);
        canchaDisponible125.setHoraInicio(16);
        canchaDisponible125.setHoraFin(18);
        canchaDisponible125.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible125);

       // Fecha 24/02/2009
        /**
        Disponibilidad canchaDisponible126 = new Disponibilidad();
        canchaDisponible126.setFechaDisponible(myDate7);
        canchaDisponible126.setHoraInicio(8);
        canchaDisponible126.setHoraFin(10);
        canchaDisponible126.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible126);

        Disponibilidad canchaDisponible127 = new Disponibilidad();
        canchaDisponible127.setFechaDisponible(myDate7);
        canchaDisponible127.setHoraInicio(10);
        canchaDisponible127.setHoraFin(12);
        canchaDisponible127.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible127);
        */
        Disponibilidad canchaDisponible128 = new Disponibilidad();
        canchaDisponible128.setFechaDisponible(myDate7);
        canchaDisponible128.setHoraInicio(12);
        canchaDisponible128.setHoraFin(14);
        canchaDisponible128.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible128);

        Disponibilidad canchaDisponible129 = new Disponibilidad();
        canchaDisponible129.setFechaDisponible(myDate7);
        canchaDisponible129.setHoraInicio(14);
        canchaDisponible129.setHoraFin(16);
        canchaDisponible129.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible129);

        Disponibilidad canchaDisponible130 = new Disponibilidad();
        canchaDisponible130.setFechaDisponible(myDate7);
        canchaDisponible130.setHoraInicio(16);
        canchaDisponible130.setHoraFin(18);
        canchaDisponible130.setCancha(canchas.get(0));
        canchasDisponibles.add(canchaDisponible130);
        //----
        Disponibilidad canchaDisponible131 = new Disponibilidad();
        canchaDisponible131.setFechaDisponible(myDate7);
        canchaDisponible131.setHoraInicio(8);
        canchaDisponible131.setHoraFin(10);
        canchaDisponible131.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible131);

        Disponibilidad canchaDisponible132 = new Disponibilidad();
        canchaDisponible132.setFechaDisponible(myDate7);
        canchaDisponible132.setHoraInicio(10);
        canchaDisponible132.setHoraFin(12);
        canchaDisponible132.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible132);
        /**
        Disponibilidad canchaDisponible133 = new Disponibilidad();
        canchaDisponible133.setFechaDisponible(myDate7);
        canchaDisponible133.setHoraInicio(12);
        canchaDisponible133.setHoraFin(14);
        canchaDisponible133.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible133);

        Disponibilidad canchaDisponible134 = new Disponibilidad();
        canchaDisponible134.setFechaDisponible(myDate7);
        canchaDisponible134.setHoraInicio(14);
        canchaDisponible134.setHoraFin(16);
        canchaDisponible134.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible134);
        */
        Disponibilidad canchaDisponible135 = new Disponibilidad();
        canchaDisponible135.setFechaDisponible(myDate7);
        canchaDisponible135.setHoraInicio(16);
        canchaDisponible135.setHoraFin(18);
        canchaDisponible135.setCancha(canchas.get(1));
        canchasDisponibles.add(canchaDisponible135);
        //----
        Disponibilidad canchaDisponible136 = new Disponibilidad();
        canchaDisponible136.setFechaDisponible(myDate7);
        canchaDisponible136.setHoraInicio(8);
        canchaDisponible136.setHoraFin(10);
        canchaDisponible136.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible136);

        Disponibilidad canchaDisponible137 = new Disponibilidad();
        canchaDisponible137.setFechaDisponible(myDate7);
        canchaDisponible137.setHoraInicio(10);
        canchaDisponible137.setHoraFin(12);
        canchaDisponible137.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible137);

        Disponibilidad canchaDisponible138 = new Disponibilidad();
        canchaDisponible138.setFechaDisponible(myDate7);
        canchaDisponible138.setHoraInicio(14);
        canchaDisponible138.setHoraFin(16);
        canchaDisponible138.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible138);
        /**
        Disponibilidad canchaDisponible139 = new Disponibilidad();
        canchaDisponible139.setFechaDisponible(myDate7);
        canchaDisponible139.setHoraInicio(16);
        canchaDisponible139.setHoraFin(18);
        canchaDisponible139.setCancha(canchas.get(2));
        canchasDisponibles.add(canchaDisponible139);
        //----
        Disponibilidad canchaDisponible140 = new Disponibilidad();
        canchaDisponible140.setFechaDisponible(myDate7);
        canchaDisponible140.setHoraInicio(8);
        canchaDisponible140.setHoraFin(10);
        canchaDisponible140.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible140);
        */
        Disponibilidad canchaDisponible141 = new Disponibilidad();
        canchaDisponible141.setFechaDisponible(myDate7);
        canchaDisponible141.setHoraInicio(12);
        canchaDisponible141.setHoraFin(14);
        canchaDisponible141.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible141);

        Disponibilidad canchaDisponible142 = new Disponibilidad();
        canchaDisponible142.setFechaDisponible(myDate7);
        canchaDisponible142.setHoraInicio(14);
        canchaDisponible142.setHoraFin(16);
        canchaDisponible142.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible142);
        /**
        Disponibilidad canchaDisponible143 = new Disponibilidad();
        canchaDisponible143.setFechaDisponible(myDate7);
        canchaDisponible143.setHoraInicio(16);
        canchaDisponible143.setHoraFin(18);
        canchaDisponible143.setCancha(canchas.get(5));
        canchasDisponibles.add(canchaDisponible143);
        */





     return canchasDisponibles;
    }




    public List<Disponibilidad> obtenerCanchasDisponibles(String fecha) {
    List<Disponibilidad> Listacanchas =llenarDatos();
    List<Disponibilidad> canchasDisponibles=new ArrayList();
    Date myDate = null;
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            myDate  = dateFormat.parse(fecha);

        } catch (ParseException e) {
            e.printStackTrace();
        }

       for (int i =0;i< Listacanchas.size();i++){
       Disponibilidad canchas =(Disponibilidad)Listacanchas.get(i);
           if (canchas.getFechaDisponible().compareTo( myDate)==0)
               canchasDisponibles.add(canchas);

       }
        return canchasDisponibles;
    }
}
