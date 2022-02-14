import java.util.Scanner;

/**
 * Класс ввода значений для вычислений
 */

/* В текущей реализации при вызове данного метода каждый раз заново нужно вводить значения.
  Пока не удалось реализовать корректную ситуацию, когда пользователю не отображается несколько раз надпись "Введите 2..."
   и не нужно вводить несколько раз значения для вычислений*/

public class Add {
    int[] numbersAdd;

    public int[] number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 любых целых числа");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        numbersAdd = new int[]{one, two};
        return numbersAdd;
    }
}
