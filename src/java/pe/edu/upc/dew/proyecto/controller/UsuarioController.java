package pe.edu.upc.dew.proyecto.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import pe.edu.upc.dew.proyecto.model.Usuario;
import pe.edu.upc.dew.proyecto.service.UsuarioService;

/**
 *
 * @author Lennon Shimokawa
 */
public class UsuarioController implements Controller {

    /**
     * ClienteService es una interface, se programa contra la interface
     */
    private UsuarioService usuarioService;

    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {

        // Recuperamos los parametros del jsp
        // Se relaciona al atributo "name"
        String username = req.getParameter("usuario");
        String password = req.getParameter("password");

        System.out.println("Usuario " + username);
        System.out.println("Password " + password);



        Usuario usuario = usuarioService.getUsuarioPorUsername(username);
        HttpSession session=req.getSession();
        if (usuario == null) {
            return new ModelAndView("index", "", null);
        } else {
            if (usuario.getPassword().equals(password)) {
                 session.setAttribute("usuario",usuario);
                return new ModelAndView("bienvenida", "usuario", usuarioService.getUsuarioPorUsername(req.getParameter("usuario")));
            } else {
                return new ModelAndView("index", "", null);

            }
        }


    }

    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
}
