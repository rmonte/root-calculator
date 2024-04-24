import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {
    @Test
    @DisplayName("Multiply two numbers")
    public void multiplyTwoNumbers() {

        Multiplication multiplication = new Multiplication();

        double result = multiplication.calculate(10, 3);

        Assertions.assertEquals(30, result);

    }
}
