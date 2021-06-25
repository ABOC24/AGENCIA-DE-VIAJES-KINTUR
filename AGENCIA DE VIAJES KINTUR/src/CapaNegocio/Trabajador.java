package CapaNegocio;

import java.util.ArrayList;

public class Trabajador {
    public Trabajador() {
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.correo = "";
        this.sueldo = "";
    }
    
    public Trabajador(String nombre, String apellidos, String dni, String correo, String sueldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.correo = correo;
        this.sueldo = sueldo;
    }
    
    private String nombre;
    private String apellidos;
    private String dni;
    private String correo;
    private String sueldo;
    public Caja recaudaDineroenCaja;
    public ArrayList<Proveedor> pagaProveedor = new ArrayList();
    public ArrayList<PaqueteTuristico> ofrecePaqueteTuristico = new ArrayList();

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    
}