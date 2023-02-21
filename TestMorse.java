package UppgiftMorsecode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestMorse {


    @Test

    public void Test1() {

        Main data = new Main();
        String a = "S";
        String actual = data.Method3(a);

        String expected = "S";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Test2() {

        Main data = new Main();
        String b= ".-";
        String actual = data.Method4(b);

        String expected = ".-";
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void Test3() {

        Main data = new Main();
        int c =10;
        int  actual = data.Method5(c);

        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }
}

