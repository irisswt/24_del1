package com.company;
import com.company.Game.*;



public class Main {

    public static void main(String[] args) {
        Game.newGame();
        while(true){
            Game.gameLoop();
            Game.rules();
        }




    }
}
