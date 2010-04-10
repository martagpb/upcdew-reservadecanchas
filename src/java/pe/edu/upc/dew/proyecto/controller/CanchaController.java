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
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import pe.edu.upc.dew.proyecto.model.Calendario;
import pe.edu.upc.dew.proyecto.model.Cancha;

import pe.edu.upc.dew.proyecto.model.Dia;
import pe.edu.upc.dew.proyecto.service.CanchaService;

/**
 *
 * @author Lennon Shimokawa
 */
public class CanchaController extends MultiActionController {

    private CanchaService canchaService;

    public ModelAndView listarCancha(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Ingreso a CanchaController");
        List<Cancha> canchas = new ArrayList<Cancha>();
        canchas = canchaService.obtenerCanchas();

        System.out.println("Cantidad de canchas" + canchas.size());

        return new ModelAndView("cancha", "canchas", canchas);
    }

    public void setCanchaService(CanchaService canchaService) {
        this.canchaService = canchaService;
    }

    public ModelAndView llenarCancha(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Entra a llenar cancha");
        Cancha cancha = new Cancha();
        String codigo = req.getParameter("codigo");
        System.out.println("Codigo " + codigo);
        cancha = canchaService.obtenerCancha(Integer.parseInt(codigo));

        return new ModelAndView("edicionCancha", "cancha", cancha);

    }

    public ModelAndView registrarCancha(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Ingreso a RegistroCancha");

        Cancha cancha = new Cancha();
        cancha.setDescripcion(req.getParameter("txtDescripcion"));
        cancha.setTipoCesped(req.getParameter("cboTipoCesped"));
        cancha.setTamano(req.getParameter("cboTamano"));
        cancha.setCostoHora(Double.parseDouble(req.getParameter("txtCosto")));

        if (req.getParameter("txtCodigo").equals("")) {
            if (canchaService.registrarCancha(cancha) > 0) {

                System.out.println("registró");
                List<Cancha> canchas = new ArrayList<Cancha>();
                canchas = canchaService.obtenerCanchas();

                return new ModelAndView("cancha", "canchas", canchas);
            } else {
                System.out.println("no registró");
                return new ModelAndView("edicionCancha", "", null);
            }

        } else {
            cancha.setCodCancha(Integer.parseInt(req.getParameter("txtCodigo")));
            if (canchaService.modificarCancha(cancha) > 0) {

                System.out.println("modificó");
                List<Cancha> canchas = new ArrayList<Cancha>();
                canchas = canchaService.obtenerCanchas();

                return new ModelAndView("cancha", "canchas", canchas);
            } else {
                System.out.println("no modificó");
                return new ModelAndView("edicionCancha", "", null);
            }


        }

    }

    public ModelAndView eliminarCancha(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Ingreso a EliminarCancha");

        Cancha cancha = new Cancha();

        cancha.setCodCancha(Integer.parseInt(req.getParameter("codigo")));

        if (canchaService.eliminarCancha(cancha) >= 0) {
            List<Cancha> canchas = new ArrayList<Cancha>();
            canchas = canchaService.obtenerCanchas();
            System.out.println("eliminó");

            return new ModelAndView("cancha", "canchas", canchas);


        } else {
            System.out.println("no eliminó");
            return new ModelAndView("cancha", "canchas", null);
         }




    }
}
