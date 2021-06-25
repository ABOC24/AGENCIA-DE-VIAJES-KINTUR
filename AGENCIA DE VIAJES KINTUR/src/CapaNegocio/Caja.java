package CapaNegocio;

import java.util.ArrayList;

public class Caja {

    //Constructor
    public Caja() {
        this.cantidadDineroPorDia = 0;
        this.totalDinero = 0;
    }
    //Constructor con parametros
    public Caja(double cantidadDineroPorDia, double totalDinero) {
        this.cantidadDineroPorDia = cantidadDineroPorDia;
        this.totalDinero = totalDinero;
    }
    
    //Atributos
    private double cantidadDineroPorDia;
    private double totalDinero;
    //Implaementar
    public ArrayList<Trabajador> recibeDineroTrabajador = new ArrayList();

    public double getCantidadDineroPorDia() {
        return cantidadDineroPorDia;
    }

    public void setCantidadDineroPorDia(double cantidadDineroPorDia) {
        this.cantidadDineroPorDia = cantidadDineroPorDia;
    }

    public double getTotalDinero() {
        return totalDinero;
    }

    public void setTotalDinero(double totalDinero) {
        this.totalDinero = totalDinero;
    }
    //Metodos
    public String RecaudarGanancias()
    {
        return "No se a implementado el metodo";
    }
}