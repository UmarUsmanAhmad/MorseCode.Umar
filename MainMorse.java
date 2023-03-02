package UppgiftMorsecode;

import java.util.Arrays;
import java.util.Scanner;

public class MainMorse {
    public static void main(String[] args) {
        //Object
        Method sc = new Method();
        System.out.println("'English to Morse or Morse to English converter'");
        System.out.println("Type '1' if you want to convert English to Morse " + " Or Type '2' if you want to convert Morse to English");

        Scanner scan = new Scanner(System.in);

        int answer = Integer.parseInt(scan.nextLine());


        //Vilkor
        if (answer == 1) {
            System.out.println("Write any letter you want to convert from English to Morse: ");

            String userInput = scan.nextLine().toLowerCase();
            userInput.split("");


            for (int j = 0; j < userInput.length(); j++) {
                for (int i = 0; i < sc.english.length; i++) {
                    if (sc.english[i].equals(String.valueOf(userInput.charAt(j)))) {
                        sc.userResult += sc.morse[i];
                    }
                }
            }
            System.out.println("Translate: " + sc.userResult);
        } else if (answer == 2) {
            System.out.println("Write any letter you want to convert from Morse to English: ");
            String userInput = scan.nextLine();

            sc.userResult = Arrays.toString(userInput.split(" "));

            for (int j = 0; j < 1; j++) {
                for (int i = 0; i < sc.morse.length; i++) {

                    if (userInput.equals(sc.morse[i])) {
                        sc.userResult = sc.english[i];
                    }
                }
                System.out.println("Translate: " + sc.userResult);
            }
        } else {
            System.out.println("Try again");
        }
    }
}

























