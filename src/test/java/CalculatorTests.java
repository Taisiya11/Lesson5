import org.junit.Assert;
import org.junit.Test;

/**
 * Класс тестирования всех действий калькулятора
 */
public class CalculatorTests {
    @Test
    public void testingCalculator() {
        CalculableCalculator sum = new Sum();
        Assert.assertTrue(sum.calculates(3, 4) == 7);
        CalculableCalculator multiplication = new Multiplication();
        Assert.assertTrue(multiplication.calculates(3, 4) == 12);
        CalculableCalculator division = new Division();
        Assert.assertTrue(division.calculates(6, 2) == 4);
        CalculableCalculator subtraction = new Subtraction();
        Assert.assertTrue(subtraction.calculates(6, 2) == 3);
    }

}
