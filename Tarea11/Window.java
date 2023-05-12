import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JFrame{
    private JLabel lblName;
    private JTextField txtName;
    private JButton button;
    private JComboBox comboBoxModel;
    private ModelName modelo;

    public Window(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        setLayout(new FlowLayout());
        lblName = new JLabel("Ingresa un nombre:");
        this.getContentPane().add(lblName);
        txtName = new JTextField(30);
        this.getContentPane().add(txtName);
        button = new JButton("Agregar");
        this.getContentPane().add(button);

        modelo = new ModelName();
        modelo.addNames("Aurora");
        modelo.addNames("Eliezer");
        modelo.addNames("Kohaku");
        comboBoxModel= new JComboBox(modelo);
        this.getContentPane().add(comboBoxModel);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String newName = txtName.getText();
                modelo.addNames(newName);
                txtName.setText("");
            }
        });

        comboBoxModel.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(comboBoxModel.getSelectedIndex());
                System.out.println(comboBoxModel.getSelectedItem());
                JOptionPane.showMessageDialog(null,"Hola " + comboBoxModel.getSelectedItem());
            }
        });
    }
}