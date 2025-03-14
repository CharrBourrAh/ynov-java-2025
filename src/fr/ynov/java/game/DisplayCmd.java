package fr.ynov.java.game;

import java.util.Scanner;

public class DisplayCmd {
    Game gameInstance;

    public DisplayCmd(Game game) {
        this.gameInstance = game;
        display();
    }

    public void display() {
        Classes playerOne = null;
        Classes playerTwo = null;
        while (gameInstance.isGameStatus()) {
            try {
                playerOne = choice(1, playerOne);

            } catch (Exception e) {
                System.out.println("Please enter an int between 1 and 3.");
                display();
            }
            try {
                playerTwo = choice(2, playerTwo);
            } catch (Exception e) {
                System.out.println("Please enter an int between 1 and 3.");
                display();
            }

        }
    }

    public Classes choice(int playerNumber, Classes varName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player " + playerNumber + ", Choose a class");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        int classNamePlayer = Integer.parseInt(scanner.nextLine());
        return switch (classNamePlayer) {
            case 1 -> varName = new Rock();
            case 2 -> varName = new Paper();
            case 3 -> varName = new Scissors();
            default -> throw new IllegalArgumentException("Invalid class");
        };
    }
}