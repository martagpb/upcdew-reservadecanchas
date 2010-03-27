/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Dia;
import pe.edu.upc.dew.proyecto.service.CalendarioService;

/**
 *
 * @author luigi
 */
public class CalendarioServlet extends HttpServlet {
   
    private CalendarioService calendarioService;

    public CalendarioServlet() {
        this.calendarioService = new CalendarioService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        System.out.println("Entra a CalendarioServlet servlet");
        String fecha = "";//req.getParameter("txtFecha");
        String nomCancha = req.getParameter("cancha");
        Cancha cancha = new Cancha();
        cancha = calendarioService.obtenerCalendario(nomCancha,fecha);

        req.setAttribute("cancha", cancha);
        req.setAttribute("dia1", ((Dia)cancha.getListDias().get(0)).getFecha());
        req.setAttribute("dia2", ((Dia)cancha.getListDias().get(1)).getFecha());
        req.setAttribute("dia3", ((Dia)cancha.getListDias().get(2)).getFecha());
        req.setAttribute("dia4", ((Dia)cancha.getListDias().get(3)).getFecha());
        req.setAttribute("dia5", ((Dia)cancha.getListDias().get(4)).getFecha());
        req.setAttribute("dia6", ((Dia)cancha.getListDias().get(5)).getFecha());
        req.setAttribute("dia7", ((Dia)cancha.getListDias().get(6)).getFecha());
        System.out.println("Entra a termino CalendarioServlet " +cancha.getListDias().size());
        req.getRequestDispatcher("Calendario.jsp").forward(req, res);
    }
}
