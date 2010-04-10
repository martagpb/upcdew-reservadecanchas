/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.service;

import java.util.List;
import pe.edu.upc.dew.proyecto.dao.ReporteDao;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.dew.proyecto.model.Reporte;

/**
 *
 * @author T13087
 */
public class ReporteServiceImpl implements ReporteService{

    private ReporteDao reporteDao;

   @Autowired

    public void setReporteDao(ReporteDao reporteDao) {
        this.reporteDao = reporteDao;
    }
    public List<Reporte> obtenerCanchasTop(String fechaI, String fechaF) {
        return reporteDao.obtenerCanchasTop(fechaI, fechaF);
    }

}
