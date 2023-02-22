package UppgiftMorsecode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestMorse {


    @Test

    public void TestLettertoMorse() {
        //Object
        Main data = new Main();
        String a = "A";

        String actual = data.Method3(a);

        String expected = ".-";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMorsetoLetter() {

        Main data = new Main();
        String b = ".-";
        String actual = data.Method4(b);

        String expected = "A";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestWordtoMorse() {

        Main data = new Main();
        String c = "ABC";
        String actual = data.Method5(c);

        String expected = ".--...-.-.";
        Assertions.assertEquals(expected, actual);
    }

}

