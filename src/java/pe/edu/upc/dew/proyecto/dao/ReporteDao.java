/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.dao;

import java.util.List;
import pe.edu.upc.dew.proyecto.model.Reporte;

/**
 *
 * @author T13087
 */
public interface ReporteDao {
    public List<Reporte> obtenerCanchasTop(String fechaI, String fechaF);

}
