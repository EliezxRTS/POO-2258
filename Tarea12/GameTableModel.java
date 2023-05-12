import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class GameTableModel implements TableModel {
    public static final int COLS = 6;
    ArrayList<VideoGame> gameData;

    public GameTableModel(ArrayList<VideoGame> gameData) {
        this.gameData = gameData;
    }

    @Override
    public int getRowCount() {
        return gameData.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columName = "";
        switch (columnIndex) {
            case 0:
                columName = "ID.";
                break;
            case 1:
                columName = "Nombre.";
                break;
            case 2:
                columName = "Genero.";
                break;
            case 3:
                columName = "Peso en GB.";
                break;
            case 4:
                columName = "Plataforma.";
                break;
            case 5:
                columName = "Desarrollador.";
                break;
        }
        return columName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VideoGame temporal = gameData.get(rowIndex);
        switch (columnIndex){
            case 0:
                return temporal.getGameId();
            case 1:
                return temporal.getGameName();
            case 2:
                return temporal.getGameGenre();
            case 3:
                return temporal.getGameSizeGB();
            case 4:
                return temporal.getGamePlatform();
            case 5:
                return temporal.getGameDeveloper();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void addNewGame(VideoGame game){
        this.gameData.add(game);
    }
}
