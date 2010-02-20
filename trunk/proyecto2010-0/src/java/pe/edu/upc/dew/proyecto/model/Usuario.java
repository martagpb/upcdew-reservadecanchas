package pe.edu.upc.dew.proyecto.model;

import java.util.List;

/**
 *
 * @author Lennon Shimokawa
 */
public class Usuario {
    private Integer idUsuario;
    private String username;
    private String password;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private List<Rol> roles;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
    
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    
    public String getNombreCompleto() {
        return getNombre()+ " " + getApellidoPaterno()+ " " + getApellidoMaterno();
    }

}
