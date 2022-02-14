import java.util.Scanner;

/**
 * Класс ввода выбранного пункта напитка из кофемашины
 */
public class EnteringValues {
    public int numberMenu() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
