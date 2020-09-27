package com.company.Game;

import java.util.Scanner;
import com.company.Dice.*;
import com.company.Player.*;


public class Game
{
    static String input;
    static boolean Game = true;

    public static void main(String[] args)
    {
        newGame();

        while(Game)
        {
            gameLoop();
        }
    }

    public static void newGame()
    {
        System.out.println("Welcome dice roll. The goal of the game is to reach 40 points and then get to sixes. Player 1 start. Please type 'r' to roll");
    }

    public static void endGame()
    {
        System.out.print("Player " + Player.playerNumber() + " wins the game!");

    }

    public static void gameLoop()
    {
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();

        if(input.toLowerCase().equals("r"))
        {
            System.out.println("Player" + Player.playerNumber());
            System.out.println(Dice.roll());
            Player.setScore(Dice.getValueDice() + Player.getScore());
            System.out.println(Player.getScore());
            Player.nextPlayer();
        }
    }
}
