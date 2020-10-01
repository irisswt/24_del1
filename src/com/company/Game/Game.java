package com.company.Game;

import java.util.Scanner;
import com.company.Dice.*;
import com.company.Player.*;


public class Game // sets the variable conditions for the dice game
{
   private static int twoSix = 0;
   private static String input;
   private static boolean Game = true;
   private static int consecu = 0;


    public static void rules() // method that sets the rules for the dice game
    {
        if (Player.getScore() >= 40) {

            if (Dice.isDiceSame()) {
                endGame();
            }
        } // if a player has a score of 40 or higher, the game ends when the two dice show the same face values.

        if (Dice.getValueDice() == 12) {
            twoSix = twoSix + 1;
        } // if the sum of the two dice equal 12 (i.e. both dice are showing equal face values), the player receives an extra turn

        if (twoSix == 2) {
            endGame();
        } //

        if (consecu >= 2) {
            twoSix = 0;
        }
    }

    /* remove comments to test game
    public static void main(String[] args) {
        newGame();
        while(Game){
            gameLoop();
            rules();
        }
    }

     */



    private static void gameScanner()
    {
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
    }

    public static void newGame()
    {
        System.out.println("Welcome to dice roll. The goal of the game is to reach 40 points and then roll a pair. " +
                "if the player rolls a pair before they reach 40 point, then they get an extra turn. " +
                "if the player rolls a pair of 1, then they loose all their points. Please type 'r' to roll");
        Player.setScore(0);
        Player.nextPlayer();
        Player.setScore(0);
        Player.nextPlayer();
        Dice.setDice(2,5);
        consecu = 0;
        twoSix = 0;
    }

    public static void endGame()
    {
        System.out.println("Player " + Player.playerNumber() + " wins the game!");
        Dice.setDice(2,5);
        System.out.println("Type 'n' to start a new game!");

        gameScanner();

        if(input.toLowerCase().equals("n"))
        {
            newGame();
        }
    }

    public static void gameLoop()
    {
        gameScanner();

        if (input.toLowerCase().equals("r"))
        {
            System.out.println(Dice.roll());
            Player.setScore(Dice.getValueDice() + Player.getScore());
            if (Dice.getValueDice() == 2) {
                Player.setScore(0);
                System.out.println("Player " + Player.playerNumber() + " Score: " + Player.getScore());
                consecu = consecu + 1;
            }
            else{
                System.out.println("Player " + Player.playerNumber() + " Score: " + Player.getScore());
                consecu = consecu + 1;
            }

            if (Dice.isDiceSame()) {
                System.out.println("You got an extra turn!");
            }
            else{
                Player.nextPlayer();
            }
        }
    }
}
