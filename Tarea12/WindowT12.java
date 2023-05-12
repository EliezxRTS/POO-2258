import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class WindowT12 extends JFrame {
    private JLabel lblGameId;
    private JLabel lblGameName;
    private JLabel lblGameGenre;
    private JLabel lblGameSize;
    private JLabel lblGamePlatform;
    private JLabel lblGameDeveloper;
    private JTextField txtGameId;
    private JTextField txtGameName;
    private JTextField txtGameGenre;
    private JTextField txtGameSize;
    private JTextField txtGamePlatform;
    private JTextField txtGameDeveloper;
    private JButton buttonAddGame;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private GameTableModel gameTableModel;
    private ArrayList<VideoGame> info;
    private JTable tblGamesTable;
    private JScrollPane scrollPane;

    public WindowT12(String title) throws HeadlessException {
        super(title);
        this.setSize(600,800);
        layout = new GridLayout(2,1);
        this.setLayout(layout);

        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(82, 189, 175));
        lblGameId = new JLabel("Id:");
        txtGameId = new JTextField(4);
        panel1.add(lblGameId);
        panel1.add(txtGameId);
        lblGameName = new JLabel("Nombre:");
        txtGameName = new JTextField(20);
        panel1.add(lblGameName);
        panel1.add(txtGameName);
        lblGameGenre = new JLabel("Genero:");
        txtGameGenre = new JTextField(20);
        panel1.add(lblGameGenre);
        panel1.add(txtGameGenre);
        lblGameSize = new JLabel("Peso GB:");
        txtGameSize = new JTextField(10);
        panel1.add(lblGameSize);
        panel1.add(txtGameSize);
        lblGamePlatform = new JLabel("Plataforma:");
        txtGamePlatform = new JTextField(20);
        panel1.add(lblGamePlatform);
        panel1.add(txtGamePlatform);
        lblGameDeveloper = new JLabel("Desarrollador:");
        txtGameDeveloper = new JTextField(20);
        panel1.add(lblGameDeveloper);
        panel1.add(txtGameDeveloper);
        buttonAddGame = new JButton("Agregar juego");
        panel1.add(buttonAddGame);
        this.getContentPane().add(panel1,0);

        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(206, 48, 111));
        info = new ArrayList<>();
        info.add(new VideoGame(1,"League Of Legends","MOBA",4.5,"Windows y MacOs","Riot Games"));
        gameTableModel = new GameTableModel(info);
        tblGamesTable = new JTable(gameTableModel);
        scrollPane = new JScrollPane(tblGamesTable);
        panel2.add(scrollPane);
        this.getContentPane().add(panel2,1);


        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.buttonAddGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VideoGame newGame = new VideoGame();
                try{
                    newGame.setGameId(Integer.parseInt(txtGameId.getText()));
                } catch (NumberFormatException numberFormatException){
                    JOptionPane.showMessageDialog(null,"El dato Id esta mal capturado");
                }
                newGame.setGameName(txtGameName.getText());
                newGame.setGameGenre(txtGameGenre.getText());
                try{
                    newGame.setGameSizeGB(Double.parseDouble(txtGameSize.getText()));
                } catch (NumberFormatException numberFormatException){
                    JOptionPane.showMessageDialog(null,"El dato Peso GB esta mal capturado");
                }
                newGame.setGamePlatform(txtGamePlatform.getText());
                newGame.setGameDeveloper(txtGameDeveloper.getText());
                gameTableModel.addNewGame(newGame);
                tblGamesTable.updateUI();
            }
        });
    }
}
