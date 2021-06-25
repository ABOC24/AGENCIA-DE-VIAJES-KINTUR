package capaNegocio;

import java.util.Date;

public class PaqueteTuristico {

    //Constructores
    public PaqueteTuristico() {
        this.precio = 0;
        this.nombrePaquete = "";
        this.cantidadPersonas = 0;
        this.codPaquete = "";
        this.horarios = null;
        this.duracionDias = 0;
        this.fechaInicioViaje = null;
        this.valorAgregado = "";
    }
    //Constructores con parametros
    public PaqueteTuristico(int precio, String nombrePaquete, int cantidadPersonas, String codPaquete, Date horarios, int duracionDias, Date fechaInicioViaje, String valorAgregado) {
        this.precio = precio;
        this.nombrePaquete = nombrePaquete;
        this.cantidadPersonas = cantidadPersonas;
        this.codPaquete = codPaquete;
        this.horarios = horarios;
        this.duracionDias = duracionDias;
        this.fechaInicioViaje = fechaInicioViaje;
        this.valorAgregado = valorAgregado;
    }
    
    //Atributos
    private int precio;
    private String nombrePaquete;
    private int cantidadPersonas;
    private String codPaquete;
    private Date horarios;
    private int duracionDias;
    private Date fechaInicioViaje;
    private String valorAgregado;
    
    //Implementar
    public Turista tieneTurista;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(String codPaquete) {
        this.codPaquete = codPaquete;
    }

    public Date getHorarios() {
        return horarios;
    }

    public void setHorarios(Date horarios) {
        this.horarios = horarios;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public Date getFechaInicioViaje() {
        return fechaInicioViaje;
    }

    public void setFechaInicioViaje(Date fechaInicioViaje) {
        this.fechaInicioViaje = fechaInicioViaje;
    }

    public String getValorAgregado() {
        return valorAgregado;
    }

    public void setValorAgregado(String valorAgregado) {
        this.valorAgregado = valorAgregado;
    }
    //Metodos
    public String LlevarViaje()
    {
        return "No se a implementado el metodo";
    }
    public String ConocerDestinos()
    {
        return "No se a implementado el metodo";
    }
}