package fr.ynov.java.game;

public class Scissors extends Classes {
    public Scissors() {
        type = "Scissors";
    }
    @Override
    Integer check(Classes playerTwoClass) {
        return switch (playerTwoClass.type) {
            case "Rock" -> 2;
            case "Paper" -> 0;
            case "Scissors" -> 1;
            default -> null;
        };
    }
}
