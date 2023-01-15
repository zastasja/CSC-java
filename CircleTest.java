import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import  org.junit.Before;
import  org.junit.Test;

public class CircleTest {
    @Test
    public void circleTest() throws IOException {
        String input = "1\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Circle.main(args);

        String consoleOutput = "Enter radius: " + System.lineSeparator();
        consoleOutput += "For the circle with radius: 1.0;" + System.lineSeparator();
        consoleOutput += "the area is: 3.141592653589793." + System.lineSeparator();

        assertEquals(consoleOutput, out.toString());
    }
}
