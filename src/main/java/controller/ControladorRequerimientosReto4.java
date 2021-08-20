package controller;

import java.util.ArrayList;
import model.dao.*;
import model.vo.*;
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {       

    private final Consulta1_19Dao consulta1_19Dao;
    private final Consulta2_19Dao consulta2_19Dao;
    private final Consulta3_19Dao consulta3_19Dao;

    public ControladorRequerimientosReto4(){
        this.consulta1_19Dao = new Consulta1_19Dao();
        this.consulta2_19Dao = new Consulta2_19Dao();
        this.consulta3_19Dao = new Consulta3_19Dao();
    }

    public ArrayList<Consulta1VO_19> realizarConsulta1() throws SQLException {
        return this.consulta1_19Dao.consulta1DAO();
    }

    public ArrayList<Consulta2VO_19> realizarConsulta2() throws SQLException {
        return this.consulta2_19Dao.consulta2DAO();
    }

    public ArrayList<Consulta3VO_19> realizarConsulta3() throws SQLException {
        return this.consulta3_19Dao.consulta3DAO();
    }
}
