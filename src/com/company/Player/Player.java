package com.company.Player;

public class Player {
        private static int currentPlayer = 0;
        private static int amountOfPlayers = 2;
        private static int p1Score = 0;
        private static int p2Score = 0;

        public Player(){

        }
        //Modulus of currentPlayer+1 to swap turn.
        public static void nextPlayer(){
            currentPlayer = (currentPlayer + 1)% (amountOfPlayers);
        }
                public static int getScore(){
            int x = 0;
            switch (currentPlayer){
                //Player1 score defined.
                case 0: {
                    x = p1Score;
                    break;
                }

                //Player2 score defined.
                case 1:{
                    x = p2Score;
                    break;
                }

                //Third player not existing.
                default:{
                    System.out.println("Error player not found");
                    break;
                }
            }
            //Return x value for setScore.
            return x;

        }

        public static void setScore(int x){
            switch (currentPlayer){
                //Set player1 score.
                case 0: {
                    p1Score = x;
                    break;
                }

                //Set player2 score.
                case 1: {
                    p2Score = x;
                    break;
                }

                //Third player not existing.
                default:{
                    System.out.println("Error player not found");
                    break;
                }

            }
        }
    //Return currentPlayer+1, to rerun code in the other case.
        public static int playerNumber(){return currentPlayer+1;}



}
