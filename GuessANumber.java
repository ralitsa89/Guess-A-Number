import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Random randomNum = new Random();
        int computerNum = randomNum.nextInt(100);

        while (true){
            System.out.print("Guess a number (1-100): ");
            String playerInput = scanner.nextLine();
            int playerNum;

            boolean isValid = true;

            for (int i = 0; i < playerInput.length(); i++) {
                if(playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57){
                    isValid = false;
                    break;
                }
                if(isValid){
                    playerNum = Integer.parseInt(playerInput);
                    if(playerNum == computerNum){
                        System.out.println("You guessed it!");
                        return;                                     //break;
                    } else if (playerNum > computerNum) {
                        System.out.println("Too High");
                        break;
                    } else {
                        System.out.println("Too Low");
                        break;
                    }
                }else {
                    System.out.println("Invalid Input.");
                }
            }
        }
    }
}