package fr.ynov.java.game;

public class Game {
    public boolean isGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(boolean gameStatus) {
        this.gameStatus = gameStatus;
    }

    private boolean gameStatus;

    public Game() {
        gameStatus = true;
    }

    public void launchGame() {
        DisplayCmd cmd = new DisplayCmd(this);
    }

    public void checkStatus(Classes playerTwo) {

    }
}
