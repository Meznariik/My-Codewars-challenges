package RockPaperScissors;

import java.util.Objects;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";

        if (p1.equals(rock) && p2.equals(scissors) || p1.equals(paper) && p2.equals(rock) || p1.equals(scissors) && p2.equals(paper)){
            return "Player 1 wins!";
        } else if (p2.equals(rock) && p1.equals(scissors) || p2.equals(paper) && p1.equals(rock) || p2.equals(scissors) && p1.equals(paper)){
            return "Player 2 wins!";
        } else if (p1.equals(p2)) {
            return "Draw";
        }
        else {
            return "Invalid input!";
        }
    }

    public static void main(String[] args) {
        System.out.println(rps("Scissors", "Rock"));
    }
}

