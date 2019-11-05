package domain;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ChickenTest {
    private PrintStream out;

    @Before
    public void setup() {
        out = mock(PrintStream.class);
        System.setOut(out);
    }

    @Test
    public void testSays_shouldCluck() {
        final Chicken chicken = new Chicken();
        chicken.says();
        verify(out).println(eq("Cluck, cluck"));
    }

    @Test
    public void testSays_rooster_shouldCock() {
        final Chicken rooster = new Chicken(Gender.MALE);
        rooster.says();
        verify(out).println(eq("Cock-a-doodle-doo"));
    }
}
