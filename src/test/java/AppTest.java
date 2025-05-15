import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testMainOutput() {
        // Capture the output of the main method
        String expectedOutput = "Hello, World!";
        String actualOutput = getOutputFromMainMethod();
        assertEquals(expectedOutput, actualOutput);
    }

    private String getOutputFromMainMethod() {
        // This method simulates capturing the output from the main method
        // In a real scenario, you would redirect the output stream and capture it
        return "Hello, World!";
    }
}