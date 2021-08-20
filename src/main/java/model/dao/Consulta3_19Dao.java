package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta3_19Dao {
    public ArrayList<Consulta3VO_19> consulta3DAO() throws SQLException {
        ArrayList<Consulta3VO_19> listacons3 = new ArrayList<>();
        String sql = "SELECT ID_Proyecto, Nombre||' '||Primer_Apellido AS nombreapellido FROM Proyecto JOIN Lider l USING (ID_Lider) WHERE Banco_Vinculado = 'Bancolombia'";

        try (Connection conn = JDBCUtilities.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Consulta3VO_19 filacons3 = new Consulta3VO_19();
                filacons3.setIdProyecto(rs.getInt("ID_Proyecto"));
                filacons3.setNombreapellido(rs.getString("nombreapellido"));
                listacons3.add(filacons3);
            }
            ps.close();
            rs.close();
            conn.close();
        }
        return listacons3;
    }
}
