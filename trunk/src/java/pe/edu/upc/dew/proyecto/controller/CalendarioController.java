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

/**
 *
 * @author luigi
 */
public class CalendarioController implements Controller {

    private CalendarioService calendarioService;

    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Entra a CalendarioController servlet");
        String fecha = "";//req.getParameter("txtFecha");
        String nomCancha = req.getParameter("cancha");
        Cancha cancha = new Cancha();
        cancha = calendarioService.obtenerCalendario("Cancha D", fecha);
        System.out.println("Nombre de cancha " + nomCancha);

        List<Dia> dias= cancha.getListDias();
        List<Calendario> calendarios= cancha.getListCalendario();
        
       // req.setAttribute("cancha", cancha);
       // req.setAttribute("dia1", ((Dia) cancha.getListDias().get(0)).getFecha());
        //req.setAttribute("dia2", ((Dia) cancha.getListDias().get(1)).getFecha());
        //req.setAttribute("dia3", ((Dia) cancha.getListDias().get(2)).getFecha());
        //req.setAttribute("dia4", ((Dia) cancha.getListDias().get(3)).getFecha());
        //req.setAttribute("dia5", ((Dia) cancha.getListDias().get(4)).getFecha());
        //req.setAttribute("dia6", ((Dia) cancha.getListDias().get(5)).getFecha());
        //req.setAttribute("dia7", ((Dia) cancha.getListDias().get(6)).getFecha());
        System.out.println("Entra a termino CalendarioServlet " + cancha.getListDias().size());

        return new ModelAndView("calendario", "cancha", cancha);
    }

    public void setCalendarioService(CalendarioService calendarioService) {
        this.calendarioService = calendarioService;
    }
}
