package model.vo;

public class Consulta1VO_19 {
    private int idProyecto;
    private String fechaInicio;
    private String constructora;
    private String serial;
    private int idTipo;

    public Consulta1VO_19(){
    }

    public Consulta1VO_19(int idProyecto){
        this.idProyecto = idProyecto;
    }

    public Consulta1VO_19(int idProyecto, String fechaInicio, String constructora, String serial){
        this.idProyecto = idProyecto;
        this.fechaInicio = fechaInicio;
        this.constructora = constructora;
        this.serial = serial;
    }
    public int getIdProyecto(){
        return idProyecto;
    }

    public void setIdProyecto (int idProyecto){
        this.idProyecto = idProyecto;
    }

    public String getFechaInicio(){
        return fechaInicio;
    }

    public void setFechaInicio (String fechaInicio){
        this.fechaInicio = fechaInicio;
    }

    public String getConstructora(){
        return constructora;
    }

    public void setConstructora (String constructora){
        this.constructora = constructora;
    }

    public String getSerial(){
        return serial;
    }

    public void setSerial( String serial){
        this.serial = serial;
    }

    public int getIdTipo(){
        return idTipo;
    }

    public void setIdTipo( int idTipo){
        this.idTipo = idTipo;
    }

    public String toString(){
        return "Consulta1VO [idProyecto=" + idProyecto + ", Fecha Inicio=" + fechaInicio + 
                ", Constructora=" + constructora +  ", Serial=" + serial +
                ", Id Tipo=" + idTipo + "]";
    }
}




