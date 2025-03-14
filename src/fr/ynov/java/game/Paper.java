package fr.ynov.java.game;

public class Paper extends Classes {
    public Paper() {
        type = "Paper";
    }
    @Override
    Integer check(Classes playerTwoClass) {
        return switch (playerTwoClass.type) {
            case "Rock" -> 0;
            case "Paper" -> 1;
            case "Scissors" -> 2;
            default -> null;
        };
    }
}
