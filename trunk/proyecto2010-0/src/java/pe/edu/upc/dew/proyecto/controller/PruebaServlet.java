package pe.edu.upc.dew.proyecto.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lennon Shimokawa
 */
public class PruebaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ingreso a PruebaServlet doGet");
        PrintWriter writer = resp.getWriter();
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        writer.println("<h1>Hola " + nombre + " " + apellido + "</h1>");
        writer.close();
    }
}









