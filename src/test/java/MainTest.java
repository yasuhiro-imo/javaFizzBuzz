import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void fizzBuzz() {
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
        assertEquals("2", Main.fizzBuzz(2, ""));
    }
}