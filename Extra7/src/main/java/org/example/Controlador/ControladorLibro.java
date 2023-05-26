package org.example.Controlador;

import org.example.Model.Libro;
import org.example.Model.ModeloTablaLibro;
import org.example.Vista.VentanaLibro;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorLibro extends MouseAdapter {
    private VentanaLibro ventanaLibro;
    private ModeloTablaLibro modeloTablaLibro;

    public ControladorLibro(VentanaLibro ventanaLibro) {
        this.ventanaLibro = ventanaLibro;
        modeloTablaLibro = new ModeloTablaLibro();
        this.ventanaLibro.getTblLibro().setModel(modeloTablaLibro);
        this.ventanaLibro.getBtnLeerDB().addMouseListener(this);
        this.ventanaLibro.getBtnAgregar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.ventanaLibro.getBtnLeerDB()){
            modeloTablaLibro.cargarDatos();
            this.ventanaLibro.getTblLibro().setModel(modeloTablaLibro);
            this.ventanaLibro.getTblLibro().updateUI();
        }

        if (e.getSource() == this.ventanaLibro.getBtnAgregar()){
            Libro libro = new Libro();
            libro.setId(0);
            libro.setTitulo(this.ventanaLibro.getTxtTitulo().getText());
            libro.setAutor(this.ventanaLibro.getTxtAutor().getText());
            if (modeloTablaLibro.agregarLibro(libro)){
                JOptionPane.showMessageDialog(ventanaLibro,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.ventanaLibro.getTblLibro().updateUI();
            } else{
                JOptionPane.showMessageDialog(ventanaLibro,"No se pudo agregar a la base de datos. Por favor revise su conexion","Error al insertar",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        this.ventanaLibro.limpiar();
    }
}