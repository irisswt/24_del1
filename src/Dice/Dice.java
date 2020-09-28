package Dice;

public class Dice {
    private static int dice1;
    private static int dice2;
    public static String toString(int x,int y)
    {
        return  x+" "+y;
    }
    public static String roll()
    {
        dice1 =  (int)(Math.random()*6)+1;
        dice2 =  (int)(Math.random()*6)+1;

        return toString(dice1,dice2);
    }
    public static Boolean isDiceSame()
    {
        return dice1 == dice2;
    }
    public static void setDice(int x, int y)
    {
        dice1 = x;
        dice2 = y;
    }
    public static int getValueDice()
    {
        return dice1+dice2;
    }

}