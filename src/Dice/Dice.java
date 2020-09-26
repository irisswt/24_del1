package Dice;

public class Dice {
    public static String toString(int x,int y)
    {
        return  x+" "+y;
    }
    public static String roll()
    {
        int dice1 =  (int)(Math.random()*6)+1;
        int dice2 =  (int)(Math.random()*6)+1;

        return toString(dice1,dice2);
    }
    public static Boolean isDiceSame(String dice)
    {
        char dice1 = dice.charAt(0);
        char dice2 = dice.charAt(2);

        return dice1 == dice2;
    }
    public static String setDice(int x, int y)
    {
        return x+" "+y;
    }
    public static int getValueDice(String dice)
    {
        int dice1 = Character.getNumericValue(dice.charAt(0));
        int dice2 = Character.getNumericValue(dice.charAt(2));
        return dice1+dice2;
    }
    public static void main(String[] args) {
        String Dice = roll();
        Dice = setDice(1,5);
        System.out.println(Dice);
        System.out.println(isDiceSame(Dice));
        System.out.println(getValueDice(Dice));



    }

}