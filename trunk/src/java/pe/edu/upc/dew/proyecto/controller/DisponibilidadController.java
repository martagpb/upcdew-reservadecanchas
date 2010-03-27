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
import pe.edu.upc.dew.proyecto.model.Disponibilidad;
import pe.edu.upc.dew.proyecto.service.DisponibilidadService;

/**
 *
 * @author Marco Antonio
 */
public class DisponibilidadController implements Controller {

    private DisponibilidadService disponibilidadService;

    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Entra a Disponibilidad servlet");
        String fecha = req.getParameter("txtFecha");

        req.setAttribute("fecha", fecha);

        List<Cancha> canchasDisponibles = new ArrayList<Cancha>();
        //canchasDisponibles = disponibilidadService.obtenerCanchasDisponibles(fecha);

        System.out.println("Cantidad de canchas disponibles " + canchasDisponibles.size());


        return new ModelAndView("disponibilidad", "canchasDisponibles", canchasDisponibles);
    }

    public void setDisponibilidadService(DisponibilidadService disponibilidadService) {
        this.disponibilidadService = disponibilidadService;
    }
}
