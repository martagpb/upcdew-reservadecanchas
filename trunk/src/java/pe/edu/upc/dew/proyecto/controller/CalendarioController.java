/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Dia;
import pe.edu.upc.dew.proyecto.model.Calendario;
import pe.edu.upc.dew.proyecto.service.CalendarioService;
import org.apache.log4j.Logger;
import pe.edu.upc.dew.proyecto.model.Hora;
import pe.edu.upc.dew.proyecto.service.CanchaService;

/**
 *
 * @author luigi
 */
public class CalendarioController implements Controller{

    private CalendarioService calendarioService;
    private CanchaService canchaService;

    public void setCanchaService(CanchaService canchaService) {
        this.canchaService = canchaService;
    }
    private Logger logger = Logger.getLogger(CalendarioController.class);

    public void setCalendarioService(CalendarioService calendarioService) {
        this.calendarioService = calendarioService;
    }

    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
           System.out.println("Entra a CalendarioController servlet");
        String fecha = req.getParameter("txtFecha");
        String codCancha = req.getParameter("cancha");
        Cancha cancha = new Cancha();
        System.out.println("Nombre de cancha " + codCancha);
        cancha = calendarioService.obtenerCalendario(codCancha, fecha);


        List<Dia> dias= cancha.getListDias();
        List<Calendario> calendarios= cancha.getListCalendario();
        System.out.println("Entra a termino CalendarioServlet " + cancha.getListDias().size());

        return new ModelAndView("calendario", "cancha", cancha);
    }
}  
