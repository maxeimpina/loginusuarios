/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author maxi
 */
public class persona {
    private String usuario;
    private String email;
    private String dni;
    private String contraseña;

    public persona() {
    }


    public persona(String usuario) {
        this.usuario = usuario;
    }

    public persona(String usuario, String email, String dni) {
        this(usuario);
        this.email = email;
        this.dni = dni;
    }
    public persona(String usuario, String contraseña, String email, String dni) {
        this(usuario,email,dni);
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
