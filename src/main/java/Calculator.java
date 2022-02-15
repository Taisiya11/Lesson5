import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 любых целых числа");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        CalculableCalculator sum = new Sum();
        sum.calculates(one, two);
        System.out.println("Сумма равна " + sum.calculates(one, two));
        CalculableCalculator multiplication = new Multiplication();
        System.out.println("Произведение равно " + multiplication.calculates(one, two));
        CalculableCalculator division = new Division();
        System.out.println("Разность равна " + division.calculates(one, two));
        CalculableCalculator subtraction = new Subtraction();
        System.out.println("Деление равно " + subtraction.calculates(one, two));
    }
}
