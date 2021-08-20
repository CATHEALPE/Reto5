package model.vo;

public class Consulta2VO_19 {
    private int idProyecto;
    private int areaMax;

    public Consulta2VO_19(){
    }

    public Consulta2VO_19(int idProyecto){
        this.idProyecto = idProyecto;
    }

    public Consulta2VO_19(int idProyecto, int areaMax){
    this.idProyecto = idProyecto;
    this.areaMax = areaMax;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public int getAreaMax() {
        return areaMax;
    }

    public void setAreaMAx(int areaMax) {
        this.areaMax = areaMax;
    }

}
