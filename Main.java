package com.company;

import java.util.Scanner;

public class Game {

    //Game Introduction
    static void displayGameIntroduction(){
        System.out.println("Lets play a Rock, Paper, or Scissor Game!");
        System.out.println("Please enter either 'Rock', 'Paper', or 'Scissor'!");
        System.out.println("Or type 'Exit' to close the game.");
    }

    //pick a random choice from the array
    //@param - takes in a array of strings that contains the computer's options
    //@return -  the random choice
    static String pickAnOption(String[] choices){
        int aPick = (int) (Math.random()*3);
        String computerPick = choices[aPick];
        System.out.println("Computer's pick was " + computerPick +".");
        return  computerPick;
    }

    //ask user to enter their choice
    //@return -  user choice
    static String askForInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        String userInput = scan.next();
        return userInput;
    }

    //function that determines who wins
    //@param - users choice and computer's randomly pick
    static void determineGamePlay(String userInput, String computerPick){
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
        String[] choices = {"Rock", "Paper", "Scissor"};

        displayGameIntroduction();
        String userInput = askForInput();
        if(userInput.equals("Exit")){
            System.exit(0);
        }else if(userInput.equals("Rock") || userInput.equals("Paper") || userInput.equals("Scissor")){
            String comInput = pickAnOption(choices);
            determineGamePlay(userInput, comInput);
        }else{
            System.out.println("Please enter either 'Rock', 'Paper', or 'Scissor' as a choice!");
        }
    }
}
