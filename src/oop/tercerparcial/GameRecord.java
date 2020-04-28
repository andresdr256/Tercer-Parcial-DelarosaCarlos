package oop.tercerparcial;

public class GameRecord {
    private String playerName;
    private int score;

    public GameRecord() {
    }

    public GameRecord(int score, String playerName) {
        this.score = score;
        this.playerName = playerName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return this.score;
    }

    public String getPlayerName() {
        return this.playerName;
    }
}
