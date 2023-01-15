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
    public void circleTest1() throws IOException {
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
    @Test
    public void circleTest3() throws IOException {
        String input = "3\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Circle.main(args);

        String consoleOutput = "Enter radius: " + System.lineSeparator();
        consoleOutput += "For the circle with radius: 3.0;" + System.lineSeparator();
        consoleOutput += "the area is: 28.274333882308138." + System.lineSeparator();

        assertEquals(consoleOutput, out.toString());
    }
    @Test
    public void circleTest0() throws IOException {
        String input = "0\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Circle.main(args);

        String consoleOutput = "Enter radius: " + System.lineSeparator();
        consoleOutput += "For the circle with radius: 0.0;" + System.lineSeparator();
        consoleOutput += "the area is: 0.0." + System.lineSeparator();

        assertEquals(consoleOutput, out.toString());
    }
    @Test
    public void circleTestNegative() throws IOException {
        String input = "-3\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Circle.main(args);

        String consoleOutput = "Enter radius: " + System.lineSeparator();
        consoleOutput += "Radius must be positive" + System.lineSeparator();

        assertEquals(consoleOutput, out.toString());
    }
}
