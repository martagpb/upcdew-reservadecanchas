package pe.edu.upc.dew.proyecto.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import pe.edu.upc.dew.proyecto.model.Calendario;
import pe.edu.upc.dew.proyecto.model.Cancha;

import pe.edu.upc.dew.proyecto.model.Dia;
import pe.edu.upc.dew.proyecto.service.CanchaService;

/**
 *
 * @author Lennon Shimokawa
 */
public class CanchaController implements Controller {

    private CanchaService canchaService;

    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {


        System.out.println("Ingreso a CanchaController doPost");
        String fecha = req.getParameter("txtFecha");
        List<Cancha> canchasDisponibles = null;
        canchasDisponibles = new ArrayList<Cancha>();
        canchasDisponibles = canchaService.obtenerCanchasDisponibles(fecha);

        System.out.println("Cantidad de canchas disponibles" + canchasDisponibles.size());

        return new ModelAndView("disponibilidad", "canchasDisponibles", canchasDisponibles);


    }

    public void setCanchaService(CanchaService canchaService) {
        this.canchaService = canchaService;
    }
}
