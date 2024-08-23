import java.util.Scanner;

class Guesser {
    int guessNum;

    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser Kindly guess the number");
        guessNum = scan.nextInt();
        if(guessNum > 0 && guessNum <= 9) {
            return guessNum;
        } else {
            System.out.println("Error! Enter the number within the range");
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Guesser Kindly guess the number");
            guessNum = scan.nextInt();
        }
        return guessNum;
    }
}

class Player {
    int guessNum;

    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player Kindly guess the number");
        guessNum = scan.nextInt();
        if(guessNum > 0 && guessNum <= 9) {
            return guessNum;
        } else {
            System.out.println("Error! Enter the number within the range");
            Scanner scan1 = new Scanner(System.in);
            guessNum = scan.nextInt();
        }
        return guessNum;
    }
}

class umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        numFromPlayer1 = p1.guessingNumber();

        Player p2 = new Player();
        numFromPlayer2 = p2.guessingNumber();

        Player p3 = new Player();
        numFromPlayer3 = p3.guessingNumber();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("Game tied");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("player1 and player2 won!");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("player1 and player3 won!");
            } else {
                System.out.println("Player1 won the game");
            }
        }  else if (numFromGuesser == numFromPlayer2) {
            if(numFromGuesser == numFromPlayer3) {
                System.out.println("Player2 and player3 won the game");
            } else {
                System.out.println("Player2 won the game");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player3 won the game");
        } else {
            System.out.println("None won the game! please try again");
        }
    }
}

public class GuessingGame {
    public static void main(String[] args) {
        umpire umpire = new umpire();
        umpire.collectNumFromGuesser();
        umpire.collectNumFromPlayers();
        umpire.compare();
    }
}
