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
import pe.edu.upc.dew.proyecto.model.Disponibilidad;
import pe.edu.upc.dew.proyecto.service.DisponibilidadService;

/**
 *
 * @author Marco Antonio
 */
public class DisponibilidadServlet extends HttpServlet {

    private DisponibilidadService disponibilidadService;

    public DisponibilidadServlet() {
        this.disponibilidadService = new DisponibilidadService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        System.out.println("Entra a Disponibilidad servlet");
        String fecha = req.getParameter("txtFecha");
        List<Disponibilidad> canchasDisponibles = new ArrayList<Disponibilidad>();
        canchasDisponibles = disponibilidadService.obtenerCanchasDisponibles(fecha);

        System.out.println("Cantidad de canchas disponibles " + canchasDisponibles.size());
        req.setAttribute("canchasDisponibles", canchasDisponibles);
        req.getRequestDispatcher("disponibilidad.jsp").forward(req, res);
    }
}
