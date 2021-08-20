package view;

import controller.ControladorRequerimientosReto4;
import model.vo.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void consulta1() {
        System.out.println("-----Consulta 1-------");
        try {
            ArrayList<Consulta1VO_19> lista = controlador.realizarConsulta1();
            System.out.println("id_proyecto,  Fecha_Inicio ,  Constructora ,  serial");

            for (Consulta1VO_19 cons1 : lista) {
                System.out.println(cons1.getIdProyecto() + " " + cons1.getFechaInicio() + " " + cons1.getConstructora()
                        + " " + cons1.getSerial());
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void consulta2() {
        System.out.println("-----Consulta 2-------");
        try {

            ArrayList<Consulta2VO_19> lista = controlador.realizarConsulta2();
            System.out.println("id_proyecto,  area_max");

            for (Consulta2VO_19 cons2 : lista) {
                System.out.println(cons2.getIdProyecto() + " " + cons2.getAreaMax());
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void consulta3() {
        System.out.println("-----Consulta 3-------");
        try {

            ArrayList<Consulta3VO_19> lista = controlador.realizarConsulta3();

            System.out.println("id_proyecto, nombreapellido");

            for (Consulta3VO_19 cons3 : lista) {
                System.out.println(cons3.getIdProyecto() + " " + cons3.getNombreApellido());
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
}
