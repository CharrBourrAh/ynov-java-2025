package fr.ynov.java.game;

public class Game {
    public boolean isGameStatus() {
        return gameStatus;
    }

    private boolean gameStatus;
    DisplayCmd cmd;

    public Game() {
        gameStatus = true;
        this.cmd = new DisplayCmd(this);
    }

    public void launchGame() {
        cmd.display();
    }

    public void checkStatus(Classes playerOne, Classes playerTwo) {
        switch (playerOne.check(playerTwo)) {
            case 0:
                gameStatus = false;
                cmd.victory(1);
                break;
            case 1:
                cmd.tie();
                break;
            case 2:
                gameStatus = false;
                cmd.victory(2);
                break;
        }
    }
}
