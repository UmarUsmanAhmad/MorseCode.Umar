package UppgiftMorsecode;


public class Method {

    //Attributes/Variables
    public String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            ",", ".", "?"};

    public String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};
    String getresult = "";

    public String Method1(String userInput) {
        String[] userCopy = userInput.split("");

        for (String s : userCopy) {
            for (int i = 0; i < english.length; i++) {
                if (english[i].equals(s)) {
                    getresult += morse[i];
                }
            }
        }
        return getresult;
    }

    public String Method2(String Text2) {

        for (int j = 0; j < 1; j++) {
            for (int i = 0; i < morse.length; i++) {

                if (Text2.equals(morse[i])) {
                    getresult = english[i];
                }
            }
        }
        return getresult;
    }

    public String Method3(String userInput) {
        String[] userCopy = userInput.split("");

        for (int j = 0; j < userCopy.length; j++) {
            for (int i = 0; i < english.length; i++) {
                if (english[i].equals(userCopy[j])) {
                    getresult += morse[i];
                }
            }
        }
        return getresult;
    }
}











