package com.company.Game;

import java.util.Scanner;
import com.company.Dice.*;
import com.company.Player.*;


public class Game
{
    static int twoSix = 0;
    static String input;
    static boolean Game = true;
    static int consecu = 0;

    public static void main(String[] args)
    {

        newGame();

        while (Game) {
            gameLoop();
        }
    }

    public static void newGame()
    {
        System.out.println("Welcome to dice roll. The goal of the game is to reach 40 points and then roll a pair. Player 1 starts. Please type 'r' to roll");
        Player.setScore(0);
        Player.nextPlayer();
        Player.setScore(0);
        Player.nextPlayer();
        Dice.setDice(2,5);
    }

    public static void endGame()
    {
        System.out.println("Player " + Player.playerNumber() + " wins the game!");
        newGame();


    }

    public static void gameLoop()
    {
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();


        if (Dice.getValueDice() == 2)
        {
            Player.setScore(0);
        }

        if (input.toLowerCase().equals("r"))
        {
            System.out.println(Dice.roll());
            Player.setScore(Dice.getValueDice() + Player.getScore());
            if (Player.getScore() > 40)
            {

                Player.setScore(40);

                System.out.println("Player " + Player.playerNumber() + " Score: " + Player.getScore());
                consecu = consecu + 1;

                if (Dice.isDiceSame())
                {
                    endGame();
                }

            }
            else
                {
                    System.out.println("Player " + Player.playerNumber() + " Score: " + Player.getScore());
                    consecu = consecu + 1;
                }

            if (Dice.isDiceSame())
            {
                System.out.println("You got an extra turn!");
            }
            else
                {
                Player.nextPlayer();
            }

        }

        if (Dice.getValueDice() == 12)
        {
            twoSix = twoSix + 1;
        }
        if (twoSix == 2)
        {
            endGame();
        }
        else
            {

            if (consecu >= 2) {
                twoSix = 0;
            }

        }
    }
}
