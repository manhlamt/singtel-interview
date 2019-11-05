package domain;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DuckTest {
    private PrintStream out;

    @Before
    public void setup() {
        out = mock(PrintStream.class);
        System.setOut(out);
    }

    @Test
    public void testSays_shouldQuack() {
        final Duck duck = new Duck();
        duck.says();
        verify(out).println(eq("Quack, quack"));
    }

    @Test
    public void testSwim_shouldSwimProperly() {
        final Duck duck = new Duck();
        duck.swim();
        verify(out).println(eq("I am swimming"));
    }
}
