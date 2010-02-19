package pe.edu.upc.dew.proyecto.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.upc.dew.proyecto.model.Rol;
import pe.edu.upc.dew.proyecto.model.Usuario;
import pe.edu.upc.dew.proyecto.service.UsuarioService;

/**
 *
 * @author Lennon Shimokawa
 */
public class LoginServlet extends HttpServlet {

    private UsuarioService usuarioService;

    public LoginServlet(){
        this.usuarioService= new UsuarioService();
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ingreso a LoginServlet doPost");
        //Recuperamos los parámetros del jsp
        //Se relaciona al atributo "name"
        String username = req.getParameter("usuario");
        String password= req.getParameter("password");
        // String[] notas= req.getParameterValues("nota");

        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setPassword(password);

        List<Rol> roles= new ArrayList<Rol>();

        
        Rol rol= new Rol();
        rol.setIdRol(1);
        rol.setNombre("Admin");
        roles.add(rol);

        rol= new Rol();
        rol.setIdRol(2);
        rol.setNombre("Usuario");
        roles.add(rol);
       
        req.setAttribute("roles", roles);

        if (usuarioService.login(usuario)){
           req.getRequestDispatcher("bienvenida.jsp").forward(req, resp);
        }else{
           req.getRequestDispatcher("index.jsp").forward(req, resp);
        }




  
    }
}
