import java.sql.SQLOutput;

public class Calculator {
    public static void main(String[] args) {
        CalculableCalculator sum = new Sum();
        System.out.println(sum.calculates());
        CalculableCalculator multiplication = new Multiplication();
        System.out.println(multiplication.calculates());

    }
}
