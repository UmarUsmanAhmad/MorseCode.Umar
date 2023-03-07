package UppgiftMorsecode;
import java.util.Scanner;

public class MainMorse {
    public static void main(String[] args) {

        System.out.println("'English to Morse or Morse to English converter'");
        System.out.println("Type '1' if you want to convert English to Morse " + " Or Type '2' if you want to convert Morse to English");
        //Object
        Method s = new Method();
        Scanner scan = new Scanner(System.in);
        int answer = Integer.parseInt(scan.nextLine());
        //Vilkor
        if (answer == 1) {
            System.out.println("Write any letter you want to convert from English to Morse: ");
            s.Method1("");

        } else if (answer == 2) {
            System.out.println("Write any letter you want to convert from Morse to English: ");
            s.Method2("");
        } else {
            System.out.println("Try again");
        }
    }
}





















