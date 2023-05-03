package UserInterface;

import UserInterface.Events.MouseEvents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PrncplGraphicInterface extends Frame {
    private Label lblName;
    private TextField txtName;
    private Button btnButton01;

    public PrncplGraphicInterface(String title) throws HeadlessException {
        super(title);
        this.setSize(500,300);
        this.setLayout(new FlowLayout());
        lblName = new Label("Nombre: ");
        this.add(lblName);
        txtName = new TextField(30);
        this.add(txtName);
        btnButton01 =new Button("Saludar");
        //btnButton01.addMouseListener(new MouseEvents());
        btnButton01.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(txtName.getText());
                JOptionPane.showMessageDialog(null, "Hola " + txtName.getText());
            }
        });
        this.add(btnButton01);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setVisible(true);
    }

}