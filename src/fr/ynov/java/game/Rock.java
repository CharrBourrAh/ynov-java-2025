package fr.ynov.java.game;

import javax.crypto.ExemptionMechanism;

public class Rock extends Classes {
    public Rock() {
        type = "Rock";
    }
    @Override
    Integer check(Classes playerTwoClass) {
        return switch (playerTwoClass.type) {
            case "Rock" -> 1;
            case "Paper" -> 2;
            case "Scissors" -> 0;
            default -> null;
        };
    }
}
