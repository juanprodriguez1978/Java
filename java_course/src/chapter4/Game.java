package chapter4;

import java.util.Random;

public class Game {
    public static void main(String[] args) {

        System.out.println("Welcome to Roll the Die! Let's begin...");

        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        int finalSpace = 20;
        Random random = new Random();

        for (int i = 1; i <= maxRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;
            lastSpace = lastSpace - die;
            if (i == 5) {
                if (currentSpace == finalSpace) {
                    System.out.println("Roll #" + i + ". You've rolled a " + die + ". You're on space 20. Congrats, you win!");
                } else if (currentSpace > finalSpace) {
                    System.out.println("Roll #" + i + ". You've rolled a " + die + ". You are now on space " + currentSpace + ". Unfortunately, that takes you past 20 spaces. You lose!");
                } else if (currentSpace < finalSpace) {
                    System.out.println("Roll #" + i + ". You've rolled a " + die + ". You are now on space " + currentSpace + ". Unfortunately, you didn't make it to all 20 spaces. You lose!");
                }
            }
                else
                    System.out.println("Roll #" + i + ". You've rolled a " + die + ". You are now on space " + currentSpace + " and have " + lastSpace + " more to go.");
        }
    }
}
