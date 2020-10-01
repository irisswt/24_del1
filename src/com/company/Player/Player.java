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
        //Modulus of currentPlayer+1 to add swap turn
        public static int getScore(){
            int x = 0;
            switch (currentPlayer){
                case 0: {
                    x = p1Score;
                    break;
                }
                //Player1 score defined

                case 1:{
                    x = p2Score;
                    break;
                }
                //Player2 score defined

                default:{
                    System.out.println("Error player not found");
                    break;
                } //third player not existing
            }
            return x;
            //Return x value
        }

        public static void setScore(int x){
            switch (currentPlayer){
                case 0: {
                    p1Score = x;
                    break;
                }
                //Set player1 score

                case 1:{
                    p2Score = x;
                    break;
                }
                //Set player2 score

                default:{
                    System.out.println("Error player not found");
                    break;
                }
                //Third player not existing
            }
        }

        public static int playerNumber(){return currentPlayer+1;}



}
