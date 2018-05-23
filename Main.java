package com.company;

import java.util.Scanner;

public class Main {

    private final String[] choices = {"Rock", "Paper", "Scissor"};

    public String pickAnOption(){
        int aPick = (int) (Math.random()*3);
        String computerPick = choices[aPick];
        return  computerPick;
    }

    public String askForInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        String userInput = scan.next();
        return userInput;
    }

    public void determineGamePlay(String userInput, String computerPick){
        if (userInput.equals(computerPick)) {
            System.out.println("It's a draw!");
        } else if (userInput.equals("Rock") && computerPick.equals("Paper")) {
            System.out.println("You lose!");
        } else if (userInput.equals("Rock") && computerPick.equals("Scissor")) {
            System.out.println("You win!");
        } else if (userInput.equals("Paper") && computerPick.equals("Rock")) {
            System.out.println("You win!");
        } else if (userInput.equals("Paper") && computerPick.equals("Scissor")) {
            System.out.println("You lose!");
        } else if (userInput.equals("Scissor") && computerPick.equals("Rock")) {
            System.out.println("You lose!");
        } else if (userInput.equals("Scissor") && computerPick.equals("Paper")) {
            System.out.println("You win!");
        }
    }

    public static void main(String[] args) {

        Main anObject = new Main();
        String computerPick = anObject.pickAnOption();

	    System.out.println("Lets play a Rock, Paper, or Scissor Game!");
        System.out.println("Please enter either 'Rock', 'Paper', or 'Scissor'!");
        System.out.println("Or type 'Exit' to close the game.");

        String userInput = anObject.askForInput();

        if(userInput.equals("Exit")){
            System.exit(0);
        }
        if(userInput.equals("Rock") || userInput.equals("Paper") || userInput.equals("Scissor")) {
            System.out.println("Computer's pick was " + computerPick +".");
            anObject.determineGamePlay(userInput, computerPick);
        }
        else{
            System.out.println("Please enter either 'Rock', 'Paper', or 'Scissor' as a choice!");
        }
    }
}
