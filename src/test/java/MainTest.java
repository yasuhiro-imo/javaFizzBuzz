import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fizzBuzz() throws Exception {
        assertEquals("fizzbuzz", Main.fizzBuzz(15, ""));
    }

    @Test
    void fizz() throws Exception {
        assertEquals("fizz", Main.fizzBuzz(3, ""));
    }

    @Test
    void buzz() throws Exception {
        assertEquals("buzz", Main.fizzBuzz(5, ""));
    }

    @Test
    void number() throws Exception {
        assertEquals("7", Main.fizzBuzz(7, ""));
    }
}