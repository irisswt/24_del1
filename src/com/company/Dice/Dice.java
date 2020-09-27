package com.company.Dice;

public class Dice {

    public static String toString(int x,int y)
    {
        return  x+" "+y;
    }
    static String roll()
    {
        int dice1 =  (int)(Math.random()*6)+1;
        int dice2 =  (int)(Math.random()*6)+1;

        return toString(dice1,dice2);
    }
    static Boolean isDiceSame(String dice)
    {
        char dice1 = dice.charAt(0);
        char dice2 = dice.charAt(2);

        return dice1 == dice2;
    }
    static String setDice(int x, int y)
    {
        return x+" "+y;
    }
    static int getValueDice(String dice)
    {
        int dice1 = Character.getNumericValue(dice.charAt(0));
        int dice2 = Character.getNumericValue(dice.charAt(2));
        return dice1+dice2;
    }


}