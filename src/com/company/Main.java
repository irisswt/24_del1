package com.company;
import com.company.Game.*;
import Test.Test;


public class Main { //method that executes newGame, rules and gameLoop from the Game class file.

    public static void main(String[] args) {
        /*
        Test.testRoll();
        Test.testAllCombinations();
        Test.testGameWinByScore();
        Test.testGameWinByTwoSix();
        Test.testTwoOnes();
        */

        Game.newGame();
        while(true){
            Game.gameLoop();
            Game.rules();
        }




    }
}
