package UppgiftMorsecode;

import java.util.Scanner;

public class MainMorse {
    public static void main(String[] args) {

        System.out.println("'English to Morse or Morse to English converter'");
        System.out.println("Type '1' if you want to convert English to Morse " + " Or Type '2' if you want to convert Morse to English");


        Scanner scan = new Scanner(System.in);
        int answer = Integer.parseInt(scan.nextLine());

        //Object
        Method s = new Method();


        //Vilkor

        if (answer == 1) {

            System.out.println("Write any letter you want to convert from English to Morse: ");
            String userInput = scan.nextLine().toLowerCase();
            String translation = s.Method1(userInput);
            System.out.println(translation);

        } else if (answer == 2) {

            System.out.println("Write any letter you want to convert from Morse to English: ");
            String userInput = scan.nextLine().toLowerCase();
            String translation = s.Method2(userInput);
            System.out.println(translation);
        } else {
            System.out.println("Try again");
        }
    }
}























