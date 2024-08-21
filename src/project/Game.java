package project;


import java.util.Scanner;

class Guesser{
    int guessingNumber;

    int guessingNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser is gussing the number");
        guessingNumber=scan.nextInt();
        return guessingNumber;
    }

}
class Player{
  int guessNumber;

    int playerGuessingNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Players please guess the number");
        guessNumber= scan.nextInt();
        return guessNumber;
    }

}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNum();

    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.playerGuessingNumber();
        numFromPlayer2 = p2.playerGuessingNumber();
        numFromPlayer3 = p3.playerGuessingNumber();

    }


    void compare() {
        if (numFromGuesser == numFromPlayer1)
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("player 1, player2, player3 all 3 players guess the number game tie between 3");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("player 1 and Player 2 guess the number correctly game is tie between player 1 & 2 ");

            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("player 1 and Player 3 guess the number correctly game is tie between player 1 & 3");

            } else {
                System.out.println("Player 1 is the winner");
            }
        else if(numFromGuesser == numFromPlayer2){
            if(numFromGuesser== numFromPlayer3){
                System.out.println("Player 2 and Player 3 guess the number both are winners");
            }
            else{
                System.out.println("Player 2 won the game");
            }
           } else if(numFromGuesser == numFromPlayer3){
            System.out.println("player 3 guess the number .. Player 3 is the winner");

        } else {
            System.out.println("No one guessed the number correctly please play again ");
           }
        }
} 


public class Game {
    public static void main(String args[]){
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}
