package Controlador;

import Vista.Ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controlador extends MouseAdapter {
    private Ventana ventana;

    public Controlador(Ventana ventana) {
        this.ventana = ventana;
        this.ventana.getBtnMensaje().addMouseListener(this);
        this.ventana.getBtnEntrada().addMouseListener(this);
        this.ventana.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == ventana.getBtnMensaje()){
            //System.out.println("Mensaje");
            ImageIcon icon = new ImageIcon("nitro.png");
            JOptionPane.showMessageDialog(ventana,"Hola desde el ejemplo",
                    "Titulo personalizado",JOptionPane.ERROR_MESSAGE,icon);

        }
        if(e.getSource() == ventana.getBtnEntrada()){
            //System.out.println("Entrada");
            String datos = JOptionPane.showInputDialog(ventana,"Ejemplo de entrada",
                    "Titulo de entrada",JOptionPane.QUESTION_MESSAGE);
            this.ventana.getLblResultado().setText(datos);
        }
        if(e.getSource() == ventana.getBtnOpcion()){
            //System.out.println("Opcion");
            int resouesta = JOptionPane.showConfirmDialog(ventana,"Borrar registro?",
                    "Confirmacion",JOptionPane.YES_NO_OPTION);
            if (resouesta == JOptionPane.YES_NO_OPTION){
                ventana.getLblResultado().setText("Eligiste la opcion '" + resouesta + "' que es SI");
            } else {
                ventana.getLblResultado().setText("Eligiste la opcion '" + resouesta + "' que es NO");
            }
        }
    }
}
