package CapaNegocio;

import java.util.ArrayList;

public class Proveedor {

    //Constructor
    public Proveedor() {
        this.nombre = ""; 
    }
    
    //Constructgor con Parametro

    public Proveedor(String nombre) {
        this.nombre = nombre;
    }
    
    
    private String nombre;
    public ArrayList <Trabajador> recibePagoTrabajador = new ArrayList();
    public ArrayList <GuiaTurismo> asignaGuiaTurismo = new ArrayList();
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    public String AsignarAvion()
    {
        return "No se a implementado el metodo Asignar Avion";
    }
    public String AsignarHotel()
    {
        return "No se a implementado el metodo Asignar Hotel";
    }
    public String ReservaPaquetes()
    {
        return "No se a implementado el metodo Reservar Paquetes";
    }
    
}