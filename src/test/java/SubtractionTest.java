import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SubtractionTest {

    @Test
    @DisplayName("Subtract two numbers")
    public void subtractTwoNumbers() {

        Subtraction subtraction = new Subtraction();

        double result = subtraction.calculate(10, 3);

        Assertions.assertEquals(7, result);

    }

}
