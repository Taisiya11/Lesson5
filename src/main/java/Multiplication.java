public class Multiplication implements CalculableCalculator {
    int[] numbers = (new Add()).number();

    @Override
    public int calculates() {
        return numbers[0] * numbers[1];
    }
}
