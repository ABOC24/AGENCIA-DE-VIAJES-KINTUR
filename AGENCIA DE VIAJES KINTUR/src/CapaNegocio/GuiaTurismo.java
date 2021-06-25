package CapaNegocio;

public class GuiaTurismo {

    //Constructor
    public GuiaTurismo() {
        this.horario = "";
        this.experiencia = "";
        this.idiomas = "";
    }
    
    //Constructor con Parametros
    public GuiaTurismo(String horario, String experiencia, String idiomas) {
        this.horario = horario;
        this.experiencia = experiencia;
        this.idiomas = idiomas;
    }
    
    private String horario;
    private String experiencia;
    private String idiomas;
    public Proveedor recibeAvisodeProveedor;
    

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }
    
    
}