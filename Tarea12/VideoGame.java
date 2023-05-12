public class VideoGame {
    private int gameId;
    private String gameName;
    private String gameGenre;
    private double gameSizeGB;
    private String gamePlatform;
    private String gameDeveloper;

    public VideoGame() {
    }

    public VideoGame(int gameId, String gameName, String gameGenre, double gameSizeGB, String gamePlatform, String gameDeveloper) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameGenre = gameGenre;
        this.gameSizeGB = gameSizeGB;
        this.gamePlatform = gamePlatform;
        this.gameDeveloper = gameDeveloper;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(String gameGenre) {
        this.gameGenre = gameGenre;
    }

    public double getGameSizeGB() {
        return gameSizeGB;
    }

    public void setGameSizeGB(double gameSizeGB) {
        this.gameSizeGB = gameSizeGB;
    }

    public String getGamePlatform() {
        return gamePlatform;
    }

    public void setGamePlatform(String gamePlatform) {
        this.gamePlatform = gamePlatform;
    }

    public String getGameDeveloper() {
        return gameDeveloper;
    }

    public void setGameDeveloper(String gameDeveloper) {
        this.gameDeveloper = gameDeveloper;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "id=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", gameGenre='" + gameGenre + '\'' +
                ", gameSizeGB=" + gameSizeGB +
                ", gamePlatform='" + gamePlatform + '\'' +
                ", gameDeveloper='" + gameDeveloper + '\'' +
                '}';
    }
}
