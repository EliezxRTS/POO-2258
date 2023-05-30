import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class VentanasExtra4 extends JFrame {
    private JPanel panel01;
    private JButton buttonPanel01;
    private JLabel labelPanel01;
    private JPanel panel02;
    private JLabel labelPanel02;
    private JPanel panel03;
    private JComboBox<String> comboBoxPanel03;
    private JPanel panel04;
    private GridLayout gridLayout;

    public VentanasExtra4(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        gridLayout = new GridLayout(2,2);
        this.getContentPane().setLayout(gridLayout);

        panel01 = new JPanel();
        panel01.setBackground(new Color(135, 96, 131));
        panel01.setLayout(new FlowLayout(FlowLayout.LEFT));
        buttonPanel01 = new JButton("Haz Click aqui!!!");
        panel01.add(buttonPanel01);
        labelPanel01 = new JLabel("...");
        panel01.add(labelPanel01);
        buttonPanel01.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                labelPanel01.setText("Por que lo hiciste?");
            }
        });
        this.getContentPane().add(panel01,0);

        String urlImagenLabel02 = "https://assets-prd.ignimgs.com/2021/06/22/mhstories2-mizu-rider-1624326108185.png?width=280";
        panel02 = new JPanel();
        panel02.setBackground(new Color(101, 96, 135));
        panel02.setLayout(new FlowLayout(FlowLayout.CENTER));
        try {
            URL urlPanel02 = new URL(urlImagenLabel02);
            Image imagePanel02 = ImageIO.read(urlPanel02);
            ImageIcon imageIconPanel02 = new ImageIcon(imagePanel02);
            labelPanel02 = new JLabel(imageIconPanel02);
            panel02.add(labelPanel02);
            this.getContentPane().add(panel02,1);
        } catch (MalformedURLException malformedURLException){
            System.out.println("URL no encontrado");
        } catch (Exception exception){
            System.out.println("Error al cargar la imagen");
        }

        panel03 = new JPanel();
        panel03.setBackground(new Color(96, 125, 135));
        panel03.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"Opcion 1","Opcion 2","Opcion 3","Opcion 4"};
        comboBoxPanel03 = new JComboBox<>(elementos);
        comboBoxPanel03.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBoxPanel03.getSelectedIndex());
            }
        });
        panel03.add(comboBoxPanel03);
        this.getContentPane().add(panel03,2);

        panel04 = new JPanel();
        panel04.setBackground(new Color(96, 135, 130));
        this.getContentPane().add(panel04,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}