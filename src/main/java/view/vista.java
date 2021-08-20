package view;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

import controller.ControladorRequerimientosReto4;
import model.vo.Consulta1VO_19;
import model.vo.Consulta2VO_19;
import model.vo.Consulta3VO_19;


public class vista  extends JFrame{
    
    private JTable tabla;
    private ControladorRequerimientosReto4 controlador;

    public vista(){

        controlador = new ControladorRequerimientosReto4();
        initUI();
        setLocationRelativeTo(null);
    }

    public void initUI(){
        setTitle("CONSULTAS RETO 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);

        JTabbedPane tbd = new JTabbedPane();
        getContentPane().add(tbd, BorderLayout.CENTER);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());

        tbd.addTab("CONSULTAS PROYECTO CONSTRUCCIÓN", panel1);

        JPanel panelEntrada = new JPanel();
        panelEntrada.add(new JLabel("REQUERIMIENTO: "));

        JButton btnConsulta = new JButton("Consulta 1");
        JButton btnConsulta2 = new JButton("Consulta 2");
        JButton btnConsulta3 = new JButton("Consulta 3");

        btnConsulta.addActionListener(e-> cargarTablaConsulta());
        btnConsulta2.addActionListener(e-> cargarTablaConsulta2());
        btnConsulta3.addActionListener(e-> cargarTablaConsulta3());

        panelEntrada.add(btnConsulta);
        panelEntrada.add(btnConsulta2);
        panelEntrada.add(btnConsulta3);
        panel1.add(panelEntrada, BorderLayout.PAGE_START);

        // Adicionar tabla para mostrar la consulta

        tabla = new JTable();
        panel1.add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    //contenido consulta 1



    private void cargarTablaConsulta() {
        try{
            ArrayList<Consulta1VO_19> lista = controlador.realizarConsulta1();

            RealizarConsulta1TableModel tableModel = new RealizarConsulta1TableModel();

            tableModel.setData(lista);

            tabla.setModel(tableModel);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private class RealizarConsulta1TableModel extends AbstractTableModel{

        private ArrayList<Consulta1VO_19> data;

        public void setData(ArrayList<Consulta1VO_19> data) {
            this.data = data;
        }

        @Override
        public String getColumnName(int column) {
            switch(column){
                case 0:
                    return "id_proyecto";
                case 1:
                    return "Fecha_Inicio";
                case 2:
                    return "Constructora";
                case 3:
                    return "serial";
            }
            return super.getColumnName(column);
        }

    
        public int getRowCount() {
            return data.size();
        }
        
        public int getColumnCount() {
            return 4;
        }
        
        public Object getValueAt(int rowIndex, int columnIndex) {

            Consulta1VO_19 registro = data.get(rowIndex);
            switch(columnIndex){
                case 0:
                    return registro.getIdProyecto();
                case 1:
                    return registro.getFechaInicio();
                case 2:
                    return registro.getConstructora();
                case 3:
                    return registro.getSerial();
            }
            return null;
        }
        
    }

    //contenido consulta2

    private void cargarTablaConsulta2() {

        try{
            ArrayList<Consulta2VO_19> lista = controlador.realizarConsulta2();
            RealizarConsulta2TableModel tableModel = new RealizarConsulta2TableModel();
            tableModel.setData(lista);
            tabla.setModel(tableModel);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private class RealizarConsulta2TableModel extends AbstractTableModel{

        private ArrayList<Consulta2VO_19> data;

        public void setData(ArrayList<Consulta2VO_19> data) {
            this.data = data;
        }

        @Override
        public String getColumnName(int column) {
            switch(column){
                case 0:
                    return "id_proyecto";
                case 1:
                    return "Area_max";
    
            }
            return super.getColumnName(column);
        }

    
        public int getRowCount() {
            return data.size();
        }

        
        public int getColumnCount() {
            return 2;
        }
        
        public Object getValueAt(int rowIndex, int columnIndex) {

            Consulta2VO_19 registro = data.get(rowIndex);
            switch(columnIndex){
                case 0:
                    return registro.getIdProyecto();
                case 1:
                    return registro.getAreaMax();            
            }
            return null;
        }
        
    }

    //Contenido consulta 3

    private void cargarTablaConsulta3() {
        try{
            ArrayList<Consulta3VO_19> lista = controlador.realizarConsulta3();
            RealizarConsulta3TableModel tableModel = new RealizarConsulta3TableModel();
            tableModel.setData(lista);
            tabla.setModel(tableModel);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private class RealizarConsulta3TableModel extends AbstractTableModel{

        private ArrayList<Consulta3VO_19> data;

        public void setData(ArrayList<Consulta3VO_19> data) {
            this.data = data;
        }

        @Override
        public String getColumnName(int column) {
            switch(column){
                case 0:
                    return "id_proyecto";
                case 1:
                    return "nombreapellido";
    
            }
            return super.getColumnName(column);
        }

    
        public int getRowCount() {
            return data.size();
        }

        
        public int getColumnCount() {
            return 2;
        }
        
        public Object getValueAt(int rowIndex, int columnIndex) {

            Consulta3VO_19 registro = data.get(rowIndex);
            switch(columnIndex){
                case 0:
                    return registro.getIdProyecto();
                case 1:
                    return registro.getNombreApellido();            
            }
            return null;
        }
    }

}
