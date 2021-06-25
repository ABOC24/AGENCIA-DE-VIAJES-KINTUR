package CapaNegocio;

import java.util.ArrayList;

public class Turista {

    //Constructor
    public Turista() {
        this.dni = "";
        this.nombres = "";
        this.apellidos = "";
        this.correo = "";
        
    }
    
    //Constructor con parametros

    public Turista(String dni, String nombres, String apellidos, String correo) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
    }
    
    
    private String dni;
    private String nombres;
    private String apellidos;
    private String correo;
    public ArrayList <PaqueteTuristico> vePaqueteTuristico = new ArrayList();

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    //Metodos
    public String Viajar()
    {
        return "No se a implementado el metodo viajar";
    }
    public String PagaDinero()
    {
        return "No se a implementado el metodo paga dinero";
    }
    
}
