package UppgiftMorsecode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestMorse {


    @Test

    public void TestLettertoMorse() {

        Method data = new Method();
        String a = "A";

        String actual = data.Method1("");

        String expected = ".-";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMorsetoLetter() {

        Method data = new Method();
        String b = ".-";
        String actual = data.Method2("");

        String expected = "A";
        Assertions.assertEquals(expected, actual);
    }

  /*  @Test
    public void TestWordtoMorse() {

        Method data = new Method();
        String c = "ABC";
        String actual = data.Method3(c);


        Assertions.assertEquals(expected, actual);
    }

   */
}
