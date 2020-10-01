package com.company.Player;

public class Player {
        private static int currentPlayer = 0;
        private static int amountOfPlayers = 2;
        private static int p1Score = 0;
        private static int p2Score = 0;

        public Player(){

         }

        public static void nextPlayer(){
            currentPlayer = (currentPlayer + 1)% (amountOfPlayers);
        }

        public static int getScore(){
            int x = 0;
            switch (currentPlayer){
                case 0: {
                    x = p1Score;
                    break;
                }
                case 1:{
                    x= p2Score;
                    break;
                }
                default:{
                    System.out.println("Error player not found");
                    break;
                }
            }
            return x;
        }

        public static void setScore(int x){
            switch (currentPlayer){
                case 0: {
                    p1Score = x;
                    break;
                }
                case 1:{
                    p2Score = x;
                    break;
                }
                default:{
                    System.out.println("Error player not found");
                    break;
                }
            }
        }

        public static int playerNumber(){return currentPlayer+1;}



}
