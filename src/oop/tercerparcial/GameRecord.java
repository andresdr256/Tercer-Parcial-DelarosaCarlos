package oop.tercerparcial;

public class GameRecord {
    private String playerName;
    private int score;
    private String toString;

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

    public String toString() {
        return (getScore()+","+getPlayerName());
    }

    public boolean equals (Object obj) {

        if (obj instanceof GameRecord) {

            GameRecord tmpGameRecord = (GameRecord) obj;

            return (String.valueOf(this.score)).equals(String.valueOf(tmpGameRecord.score))
                    && this.playerName.equals(tmpGameRecord.playerName);
        }
        else
            return false;
    }
}
