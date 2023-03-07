package UppgiftMorsecode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestMorse {


    @Test

    public void TestEnglishtoMorse() {

        Method data1 = new Method();
        String a = ".-";
        String actual = data1.Method1(a);
        String expected = data1.getresult;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void TestMorsetoEnglish() {

        Method data2 = new Method();
        String b = "A";
        String actual = data2.Method2(b);
        String expected = data2.getresult;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestWordtoMorse() {

        Method data3 = new Method();
        String c = "ABC";
        String actual = data3.Method3(c);
        String expected = data3.getresult;

        Assertions.assertEquals(expected, actual);
    }

}
