package com.company.Dice;

public class Dice {
    private static int dice1;
    private static int dice2;
    public static String toString(int x,int y)
    {
        return  x+" "+y;
    }
    //The method roll dedicates a random number to dice1 and a random number to dice2
    public static String roll()
    {
        dice1 =  (int)(Math.random()*6)+1;
        dice2 =  (int)(Math.random()*6)+1;

        return toString(dice1,dice2);
    }
    //The method isDiceSame checks if dice1 is equal to dice2
    public static Boolean isDiceSame()
    {
        return dice1 == dice2;
    }
    //The method setDice is use to set the dices a specific number
    public static void setDice(int x, int y)
    {
        dice1 = x;
        dice2 = y;
    }
    //The method getValueDice gets the sum of dice1 + dice2
    public static int getValueDice()
    {
        return dice1+dice2;
    }

}