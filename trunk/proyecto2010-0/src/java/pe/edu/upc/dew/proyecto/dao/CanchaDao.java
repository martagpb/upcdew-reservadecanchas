/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.dao;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.proyecto.model.Cancha;

/**
 *
 * @author usuario
 */
public class CanchaDao {





    public List<Cancha> obtenerCanchas() {

        List<Cancha> canchas = new ArrayList<Cancha>();

        Cancha cancha1 = new Cancha();
        cancha1.setCodCancha(1);
        cancha1.setDescripcion("Cancha A");
        cancha1.setTipoCesped("Natural");
        cancha1.setCostoHora(80.00);
        cancha1.setTamano("Grande");
        cancha1.setEstado(1);

        canchas.add(cancha1);

        Cancha cancha2 = new Cancha();
        cancha2.setCodCancha(2);
        cancha2.setDescripcion("Cancha B");
        cancha2.setTipoCesped("Natural");
        cancha2.setCostoHora(70.00);
        cancha2.setTamano("Grande");
        cancha2.setEstado(1);

        canchas.add(cancha2);


        Cancha cancha3 = new Cancha();
        cancha3.setCodCancha(3);
        cancha3.setDescripcion("Cancha C");
        cancha3.setTipoCesped("Artificial");
        cancha3.setCostoHora(90.00);
        cancha3.setTamano("Mediana");
        cancha3.setEstado(1);

        canchas.add(cancha3);

        Cancha cancha4 = new Cancha();
        cancha4.setCodCancha(4);
        cancha4.setDescripcion("Cancha D");
        cancha4.setTipoCesped("Artificial");
        cancha4.setCostoHora(100.00);
        cancha4.setTamano("Grande");
        cancha4.setEstado(1);

        canchas.add(cancha4);


        Cancha cancha5 = new Cancha();
        cancha5.setCodCancha(5);
        cancha5.setDescripcion("Cancha D");
        cancha5.setTipoCesped("Artificial");
        cancha5.setCostoHora(100.00);
        cancha5.setTamano("Grande");
        cancha5.setEstado(1);

        canchas.add(cancha5);

        Cancha cancha6 = new Cancha();
        cancha6.setCodCancha(6);
        cancha6.setDescripcion("Cancha D");
        cancha6.setTipoCesped("Artificial");
        cancha6.setCostoHora(100.00);
        cancha6.setTamano("Grande");
        cancha6.setEstado(1);

        canchas.add(cancha6);

        Cancha cancha7 = new Cancha();
        cancha7.setCodCancha(7);
        cancha7.setDescripcion("Cancha E");
        cancha7.setTipoCesped("Artificial");
        cancha7.setCostoHora(150.00);
        cancha7.setTamano("Mediano");
        cancha7.setEstado(1);

        canchas.add(cancha7);

        Cancha cancha8 = new Cancha();
        cancha8.setCodCancha(8);
        cancha8.setDescripcion("Cancha F");
        cancha8.setTipoCesped("Natural");
        cancha8.setCostoHora(115.00);
        cancha8.setTamano("Pequeño");
        cancha8.setEstado(1);

        canchas.add(cancha8);

        Cancha cancha9 = new Cancha();
        cancha9.setCodCancha(9);
        cancha9.setDescripcion("Cancha G");
        cancha9.setTipoCesped("Natural");
        cancha9.setCostoHora(90.00);
        cancha9.setTamano("Mediano");
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
