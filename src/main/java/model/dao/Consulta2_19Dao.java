package model.dao;

import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.JDBCUtilities;
import model.vo.*;

public class Consulta2_19Dao {

    public ArrayList<Consulta2VO_19> consulta2DAO() throws SQLException {
        ArrayList<Consulta2VO_19> listacons2 = new ArrayList<>();
        String sql = "SELECT ID_Proyecto, Area_Max FROM Proyecto p JOIN Tipo USING (ID_Tipo) WHERE Numero_Habitaciones = 2";

        try (Connection conn = JDBCUtilities.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Consulta2VO_19 filacons2 = new Consulta2VO_19();
                filacons2.setIdProyecto(rs.getInt("ID_Proyecto"));
                filacons2.setAreaMAx(rs.getInt("Area_Max"));
                listacons2.add(filacons2);
            }
            ps.close();
            rs.close();
            conn.close();
        }
        return listacons2;
    }
}
