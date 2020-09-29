package Test;

import com.company.Dice.Dice;
import com.company.Game.Game;
import com.company.Player.Player;


public class Test
{

// Tests the method roll from Dice class a 1000 times to check probability on results and doubles
    public static void testRoll()
    {
        int testCounter = 0;

        int sameDiceCounter = 0;

        int facevalueTwo = 0;
        int facevalueThree = 0;
        int facevalueFour = 0;
        int facevalueFive = 0;
        int facevalueSix = 0;
        int facevalueSeven = 0;
        int facevalueEight = 0;
        int facevalueNine = 0;
        int facevalueTen = 0;
        int facevalueEleven = 0;
        int facevalueTwelve = 0;

        while(testCounter<1000)
        {
            Dice.roll();
               switch(Dice.getValueDice())
            {
                case 2 : facevalueTwo++;
                break;
                case 3 : facevalueThree++;
                break;
                case 4 : facevalueFour++;
                break;
                case 5 : facevalueFive++;
                break;
                case 6 : facevalueSix++;
                break;
                case 7 : facevalueSeven++;
                break;
                case 8 : facevalueEight++;
                break;
                case 9 : facevalueNine++;
                break;
                case 10 : facevalueTen++;
                break;
                case 11 : facevalueEleven++;
                break;
                case 12 : facevalueTwelve++;
                break;

                default : System.out.println("Error: Dice didn't roll a value between 1-6");
            }
            if(Dice.isDiceSame() == true)
            {
                sameDiceCounter++;
            }
            testCounter++;
        }
        System.out.println("Out of 1000 rolls 2 was rolled: " + facevalueTwo + " times.");
        System.out.println("Out of 1000 rolls 3 was rolled: " + facevalueThree + " times.");
        System.out.println("Out of 1000 rolls 4 was rolled: " + facevalueFour + " times.");
        System.out.println("Out of 1000 rolls 5 was rolled: " + facevalueFive + " times.");
        System.out.println("Out of 1000 rolls 6 was rolled: " + facevalueSix + " times.");
        System.out.println("Out of 1000 rolls 7 was rolled: " + facevalueSeven + " times.");
        System.out.println("Out of 1000 rolls 8 was rolled: " + facevalueEight + " times.");
        System.out.println("Out of 1000 rolls 9 was rolled: " + facevalueNine + " times.");
        System.out.println("Out of 1000 rolls 10 was rolled: " + facevalueTen + " times.");
        System.out.println("Out of 1000 rolls 11 was rolled: " + facevalueEleven + " times.");
        System.out.println("Out of 1000 rolls 12 was rolled: " + facevalueTwelve + " times.");

        System.out.println("Out of 1000 rolls the amount of times the dice rolled double was: " + sameDiceCounter);
    }

    // Tests all combinations of rolls by using the setDice, toString and getValueDice methods from Dice class
    public static void testAllCombinations()
    {


        for(int i=1; i<=6; i++)
        {

            for(int j=1; j<=6; j++)
            {
                Dice.setDice(i,j);
                System.out.println(Dice.toString(i,j) + " = " + Dice.getValueDice());
            }
        }
    }

    // Tests resetting of points when rolling double one.
    public static void testTwoOnes()
    {
        Player.setScore(20);
        System.out.println(Player.getScore());
        Dice.setDice(1,1);
        Game.rules();
        System.out.println(Player.getScore());

    }

// Tests winning condition of rolling double after getting 40 points.
    public static void testGameWinByScore()
    {
        Player.setScore(41);
        Dice.setDice(5, 5);
        Game.rules();
    }

    // Test winning condition by rolling double six twice.
    public static void testGameWinByTwoSix()
    {
        Dice.setDice(6,6);
        Game.rules();
        Game.rules();
    }


}

