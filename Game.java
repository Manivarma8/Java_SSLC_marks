package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] mani = {
                "Apple", "Angle", "Camel", "Clean", "Zebra",
                "Table", "Chair", "House", "Plant", "Bread",
                "Fruit", "River", "Ocean", "Beach", "Sugar",
                "Spice", "Light", "Night", "Earth", "Water",
                "Flame", "Storm", "Cloud", "Train", "Plane",
                "Grass", "Stone", "Brick", "Trees", "Angel",
                "Music", "Dance", "Movie", "Books", "Sword",
                "Magic", "Horse", "Sheep", "Eagle", "Shark",
                "Fishy", "Happy", "Smile", "Brave", "Truth",
                "Glory", "Dream", "Sleep", "Peace"
            };

        int randomIndex = (int) (Math.random() * mani.length);
        String selectedWord = mani[randomIndex];
        
        System.out.println("Randomly selected word " );
        
        char[] wordChars = selectedWord.toCharArray();
        boolean[] correctChars = new boolean[wordChars.length];
        int correctCount = 0;
        Set<Character> guessedChars = new HashSet<>(); // To track guessed characters
        
        while (correctCount < wordChars.length) {
            System.out.println("Enter a character:");
            String input = sc.nextLine();
            if (input.length() != 1) {
                System.out.println("Please enter a single character.");
                continue;
            }
            char userInput = input.charAt(0);
            
            if (guessedChars.contains(userInput)) {
                System.out.println("You already guessed the character '" + userInput + "'. Try a different one.");
                continue;
            }
            
            guessedChars.add(userInput);
            
            boolean found = false;
            for (int i = 0; i < wordChars.length; i++) {
                if (userInput == wordChars[i] && !correctChars[i]) {
                    correctChars[i] = true;
                    correctCount++;
                    found = true;
                }
            }
            
            if (found) {
                System.out.println("Correct! The character '" + userInput + "' is in the string.");
            } else {
                System.out.println("Incorrect! The character '" + userInput + "' is not in the string.");
            }
            
            System.out.print("Current status: ");
            for (int i = 0; i < wordChars.length; i++) {
                if (correctChars[i]) {
                    System.out.print(wordChars[i]);
                } else {
                    System.out.print('_');
                }
            }
            System.out.println();
        }
        
        System.out.println("Congratulations! You guessed the word: " + selectedWord);
        
        sc.close();
    }
}
