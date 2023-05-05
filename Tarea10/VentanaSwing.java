import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaSwing extends JFrame {
    private JLabel lblEtiqueta1;
    private JTextField txtGrados;
    private JButton boton1;
    private JLabel lblResultado;
    private FlowLayout layout;

    public VentanaSwing(String title) throws HeadlessException {
        super(title);
        this.setSize(400,100);
        layout = new FlowLayout();
        this.getContentPane().setLayout(layout);
        lblEtiqueta1 = new JLabel("Grados C. ");
        this.getContentPane().add(lblEtiqueta1);
        txtGrados = new JTextField(10);
        this.getContentPane().add(txtGrados);
        boton1 = new JButton("Convertir");
        this.getContentPane().add(boton1);
        lblResultado = new JLabel("0.0°");
        this.getContentPane().add(lblResultado);
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double centigrados = 0;
                try {
                    centigrados = Double.parseDouble(txtGrados.getText());
                } catch (NumberFormatException numberFormatException) {
                    JOptionPane.showMessageDialog(null,"El dato ingresado no era un numero");
                }
                double fahrenheit = (centigrados * 9.0 / 5.0) + 32.0;
                lblResultado.setText(fahrenheit + " °F");
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null,"Finalizo...");
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}