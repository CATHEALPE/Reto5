package model.dao;

import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.JDBCUtilities;
import model.vo.*;

public class Consulta1_19Dao {
    public ArrayList<Consulta1VO_19> consulta1DAO() throws SQLException {
        ArrayList<Consulta1VO_19> lista = new ArrayList<>();

        String sql = "SELECT ID_Proyecto, Fecha_Inicio, Constructora, Serial FROM Proyecto WHERE ID_Proyecto < 15";

        try (Connection conn = JDBCUtilities.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Consulta1VO_19 fila = new Consulta1VO_19();
                fila.setIdProyecto(rs.getInt("ID_Proyecto"));
                fila.setFechaInicio(rs.getString("Fecha_Inicio"));
                fila.setConstructora(rs.getString("Constructora"));
                fila.setSerial(rs.getString("Serial"));
                lista.add(fila);
            }
            ps.close();
            rs.close();
            conn.close();
        }
        return lista;
    }
}
