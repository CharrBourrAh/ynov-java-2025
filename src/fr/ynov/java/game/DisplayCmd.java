package fr.ynov.java.game;

import java.util.Scanner;

public class DisplayCmd {
    Game gameInstance;

    public DisplayCmd(Game game) {
        this.gameInstance = game;
    }

    public void display() {
        Classes playerOne = null;
        Classes playerTwo = null;
        while (gameInstance.isGameStatus()) {
            try {
                playerOne = choice(1);

            } catch (Exception e) {
                System.out.println("Please enter an int between 1 and 3.");
                display();
            }
            try {
                playerTwo = choice(2);
            } catch (Exception e) {
                System.out.println("Please enter an int between 1 and 3.");
                display();
            }
            assert playerOne != null;
            assert playerTwo != null;
            gameInstance.checkStatus(playerOne, playerTwo);
        }
    }

    public Classes choice(int playerNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Score : Player 1 : "+ gameInstance.getScorePlayerOne()+ " points - Player 2 : "+ gameInstance.getScorePlayerTwo()+ " points");
        System.out.println("Player " + playerNumber + ", Choose a class");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        int classNamePlayer = Integer.parseInt(scanner.nextLine());
        return switch (classNamePlayer) {
            case 1 -> new Rock();
            case 2 -> new Paper();
            case 3 -> new Scissors();
            default -> throw new IllegalArgumentException("Invalid class");
        };
    }

    public void victory(int playerNumber) {
        System.out.println("Player " + playerNumber + " has won!");
    }

    public void tie() {
        System.out.println("That's a tie !");
    }
}
