package com.company;

import java.util.Scanner;

public class Main {
    //an array of possible options
    private final String[] choices = {"Rock", "Paper", "Scissor"};

    //pick a random choice from the array
    //return the random choice
    public String pickAnOption(){
        int aPick = (int) (Math.random()*3);
        String computerPick = choices[aPick];
        return  computerPick;
    }

    //ask user to enter their choice
    //return that choice
    public String askForInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        String userInput = scan.next();
        return userInput;
    }

    //function that determines who wins
    //parameters are the users choice and computer's randomly pick
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

        //Introduction to the game for the user
        System.out.println("Lets play a Rock, Paper, or Scissor Game!");
        System.out.println("Please enter either 'Rock', 'Paper', or 'Scissor'!");
        System.out.println("Or type 'Exit' to close the game.");

        Main anObject = new Main();
        //ask for user's input
        String userInput = anObject.askForInput();
        //pick a random choice to play against
        String computerPick = anObject.pickAnOption();

        //if exit, then close the program
        if(userInput.equals("Exit")){
            System.exit(0);
        }
        //if user enters a valid choice
        if(userInput.equals("Rock") || userInput.equals("Paper") || userInput.equals("Scissor")) {
            System.out.println("Computer's pick was " + computerPick +".");
            anObject.determineGamePlay(userInput, computerPick);
        }
        //if user does not enter a valid choice, ask them to enter a valid option
        else{
            System.out.println("Please enter either 'Rock', 'Paper', or 'Scissor' as a choice!");
        }
    }
}
