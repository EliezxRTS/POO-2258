package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaLibro extends JFrame{
    private JLabel lblId;
    private JLabel lblTitulo;
    private JLabel lblAutor;
    private JTextField txtId;
    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JButton btnAgregar;
    private JButton btnLeerDB;
    private JTable tblLibro;
    private JScrollPane scrollPane;
    private GridLayout gridLayout;
    private JPanel panel1; //Formulario de captura
    private JPanel panel2; //Tabla para visualizar
    private JPanel panel3;
    private JPanel panel4;

    public VentanaLibro(String title) throws HeadlessException {
        super(title);
        this.setSize(1000,1000);
        gridLayout = new GridLayout(2,2);
        this.getContentPane().setLayout(gridLayout);
        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(220, 151, 86));
        lblId = new JLabel("Id: ");
        lblTitulo = new JLabel("Titulo: ");
        lblAutor = new JLabel("Autor: ");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtTitulo = new JTextField(25);
        txtAutor = new JTextField(25);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblTitulo);
        panel1.add(txtTitulo);
        panel1.add(lblAutor);
        panel1.add(txtAutor);
        panel1.add(btnAgregar);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(239, 222, 73));
        btnLeerDB = new JButton("Cargar datos de la DB");
        panel2.add(btnLeerDB);
        tblLibro = new JTable();
        scrollPane = new JScrollPane(tblLibro);
        panel2.add(scrollPane);

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(152, 194, 56));


        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(55, 215, 215));

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);


    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JLabel getLblAutor() {
        return lblAutor;
    }

    public void setLblAutor(JLabel lblAutor) {
        this.lblAutor = lblAutor;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(JTextField txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    public JTextField getTxtAutor() {
        return txtAutor;
    }

    public void setTxtAutor(JTextField txtAutor) {
        this.txtAutor = txtAutor;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblLibro() {
        return tblLibro;
    }

    public void setTblLibro(JTable tblLibro) {
        this.tblLibro = tblLibro;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public GridLayout getGridLayout() {
        return gridLayout;
    }

    public void setGridLayout(GridLayout gridLayout) {
        this.gridLayout = gridLayout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBtnLeerDB() {
        return btnLeerDB;
    }

    public void setBtnLeerDB(JButton btnLeerDB) {
        this.btnLeerDB = btnLeerDB;
    }
    public void limpiar(){
        txtTitulo.setText("");
        txtAutor.setText("");
    }
}