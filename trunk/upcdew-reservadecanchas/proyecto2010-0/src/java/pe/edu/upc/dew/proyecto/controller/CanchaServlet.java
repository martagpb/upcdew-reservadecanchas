package pe.edu.upc.dew.proyecto.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.upc.dew.proyecto.model.Cancha;

import pe.edu.upc.dew.proyecto.service.CanchaService;



/**
 *
 * @author Lennon Shimokawa
 */
public class CanchaServlet extends HttpServlet {

    private CanchaService canchaService;

    public CanchaServlet() {
        this.canchaService = new CanchaService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("Ingreso a CanchaServlet doPost");

        List<Cancha> canchas = new ArrayList<Cancha>();
        canchas = canchaService.obtenerCanchas();
        System.out.println("Cantidad de canchas " + canchas.size());
        req.setAttribute("canchas", canchas);
        req.getRequestDispatcher("disponibilidad.jsp").forward(req, resp);
    }
}
