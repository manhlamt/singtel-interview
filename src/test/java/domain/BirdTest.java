package domain;

import domain.Bird;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

public class BirdTest {
    private PrintStream out;

    @Before
    public void setup() {
        out = mock(PrintStream.class);
        System.setOut(out);
    }

    @Test
    public void testSing_shouldPrintlnCorrectly() {
        final Bird bird = new Bird();
        bird.sing();
        verify(out).println(eq("I'm singing ... chirp chirp !!!"));
    }
}
