package Player;

public class Player {
        private static int currentPlayer;
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
                case 1: {
                    x = p1Score;
                }
                case 2:{
                    x= p2Score;
                }
                default:{
                    System.out.println("Error player not found");
                }
            }
            return x;
        }

        public static void setScore(int x){
            switch (currentPlayer){
                case 1: {
                    p1Score = x;
                }
                case 2:{
                    p2Score = x;
                }
                default:{
                    System.out.println("Error player not found");
                }
            }
        }

        public static int playerNumber(){return currentPlayer+1;}



}
