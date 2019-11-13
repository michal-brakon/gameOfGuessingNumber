import java.util.Scanner;
public class gameOfGuessing {
    public static void main(String[] args) {
        double number = Math.random();
        double xNumber = number * 100 + 1;
        int numberToGuess = (int) xNumber; // liczba do zgadniecia to 1-100
        int numberOfGuesses = 10;
        boolean win = false;
        System.out.println("I have randomly chosen a number between 1 and 100");
        System.out.println("Try to guess it");


        for (int i = numberOfGuesses; i > 0; i--) { //pentla pozwalajaca na okreslona ilosc prób
            System.out.println("You have " + i + " guess(es) left");
            System.out.println("Choose number:");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            if (userNumber == numberToGuess) {
                win = true;
                break;
            } else if (userNumber > numberToGuess) { //wyswietla komnikat jesli szukana liczba jest mniejsza
                System.out.println("Number is smaller"); }
            else if (userNumber < numberToGuess) { // wyswietla komunikat jesli szukana liczba jest wieksza
                System.out.println("Number is bigger");}
        }
            if(win) {
                System.out.println("Correct! You win, the number was " + numberToGuess); }//komunikat wygranej
        else  {
            System.out.println("You lost"); // komunikat wygranej
                System.out.println("The number was " + numberToGuess);}




        }
    }







