import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    @DisplayName("Division two numbers")
    public void divisionTwoNumbers() {

        Division division = new Division();

        double result = division.calculate(10, 2);

        Assertions.assertEquals(5, result);

    }
}
