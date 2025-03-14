package fr.ynov.java.game;

public class Game {
    public boolean isGameStatus() {
        return gameStatus;
    }

    private boolean gameStatus;

    public int getScorePlayerOne() {
        return scorePlayerOne;
    }

    private int scorePlayerOne;

    public int getScorePlayerTwo() {
        return scorePlayerTwo;
    }

    private int scorePlayerTwo;
    DisplayCmd cmd;

    public Game() {
        gameStatus = true;
        this.cmd = new DisplayCmd(this);
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
    }

    public void launchGame() {
        while (scorePlayerOne < 10 && scorePlayerTwo < 10) {
            gameStatus = true;
            cmd.display();
        }
    }

    public void checkStatus(Classes playerOne, Classes playerTwo) {
        switch (playerOne.check(playerTwo)) {
            case 0:
                gameStatus = false;
                cmd.victory(1);
                scorePlayerOne++;
                break;
            case 1:
                cmd.tie();
                break;
            case 2:
                gameStatus = false;
                cmd.victory(2);
                scorePlayerTwo++;
                break;
        }
    }
}
