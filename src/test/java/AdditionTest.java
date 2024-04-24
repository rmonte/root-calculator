import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    @DisplayName("Sum two numbers")
    public void sumTwoNumbers() {
        Addition addition = new Addition();

        double result = addition.calculate(10, 40);

        Assertions.assertEquals(50, result);
    }
}
