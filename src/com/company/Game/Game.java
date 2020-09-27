package com.company.Game;

import java.util.Scanner;


public class Game
{

    public static void newGame()
    {
        System.out.println("New Game");
    }

    public static void endGame()
    {

    }

    public static void gameLoop()
    {
        Scanner scan = new Scanner(System.in);
        if (scan.equals("n".toLowerCase()))
        {
            newGame();
        }
    }
}
