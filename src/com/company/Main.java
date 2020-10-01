package com.company;
import com.company.Game.*;



public class Main { //method that executes newGame, rules and gameLoop from the Game class file.

    public static void main(String[] args) {
        Game.newGame();
        while(true){
            Game.gameLoop();
            Game.rules();
        }




    }
}
