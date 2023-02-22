package UppgiftMorsecode;

import java.util.Arrays;
import java.util.Scanner;

public class Method {

    //Attributes/Variables
    String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            ",", ".", "?"};

    String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};

    Scanner scan = new Scanner(System.in);
    int answer = Integer.parseInt(scan.nextLine());

    public String Method1(String a) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine().toLowerCase();
        userInput.split("");
        String userResult = "";

        for (int j = 0; j < userInput.length(); j++) {
            for (int i = 0; i < english.length; i++) {
                if (english[i].equals(String.valueOf(userInput.charAt(j)))) {
                    userResult += morse[i];
                }
            }
        }
        System.out.println("Translate: " + userResult);
        return userResult;
    }

    public void Method2() {
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();

        String userResult = Arrays.toString(userInput.split(" "));

        for (int j = 0; j < 1; j++) {
            for (int i = 0; i < morse.length; i++) {

                if (userInput.equals(morse[i])) {
                    userResult = english[i];
                }
            }
            System.out.println("Translate: " + userResult);
        }
    }
}







