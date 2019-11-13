import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        double number = Math.random();
        double xNumber = number * 100 + 1;
        int numberToGuess = (int) xNumber; // liczba do zgadniecia to 1-100
        int numberOfGuesses = 10;
        boolean win = false;
        System.out.println("I have randomly chosen a number between 1 and 100");
        System.out.println("Try to guess it");


        for (int i = numberOfGuesses; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left");
            System.out.println("Choose number:");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            if (userNumber == numberToGuess) {
                win = true;
                break;
            } else if (userNumber > numberToGuess) {
                System.out.println("Number is smaller"); }
            else if (userNumber < numberToGuess) {
                System.out.println("Number is bigger");}
        }
            if(win) {
                System.out.println("Correct! You win, the number was " + numberToGuess); }
        else  {
            System.out.println("You lost");
                System.out.println("The number was " + numberToGuess);}




        }
    }







