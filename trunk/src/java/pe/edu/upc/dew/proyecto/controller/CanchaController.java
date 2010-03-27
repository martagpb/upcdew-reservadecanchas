package pe.edu.upc.dew.proyecto.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import pe.edu.upc.dew.proyecto.model.Cancha;

import pe.edu.upc.dew.proyecto.service.CanchaService;

/**
 *
 * @author Lennon Shimokawa
 */
public class CanchaController implements Controller {

    private CanchaService canchaService;

    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {

        System.out.println("Ingreso a CanchaServlet doPost");

        List<Cancha> canchas = new ArrayList<Cancha>();
        canchas = canchaService.obtenerCanchas();
        System.out.println("Cantidad de canchas " + canchas.size());

        return new ModelAndView("disponibilidad", "canchas", canchas);


    }

    public void setCanchaService(CanchaService canchaService) {
        this.canchaService = canchaService;
    }
}
