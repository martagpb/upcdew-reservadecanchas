/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import pe.edu.upc.dew.proyecto.model.Reporte;
import pe.edu.upc.dew.proyecto.service.ReporteService;



/**
 *
 * @author T13087
 */
public class ReporteController implements Controller{

    private ReporteService reporteService;

    public void setReporteService(ReporteService reporteService) {
        this.reporteService = reporteService;
    }

    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String fechaI = req.getParameter("txtFechaI");
        String fechaF = req.getParameter("txtFechaF");

        List<Reporte> canchasTop = new ArrayList<Reporte>();
        canchasTop = reporteService.obtenerCanchasTop(fechaI, fechaF);

        return new ModelAndView("reporteCanchas", "canchasTop", canchasTop);
    }

}
