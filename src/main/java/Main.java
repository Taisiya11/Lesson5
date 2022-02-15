import java.util.ArrayList;
import java.util.Arrays;

/**
 * Класс запуска и вывода реализации
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> line = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1, 0, 0,1));
        ActionsOnAnArray actionsOnAnArray = new ActionsOnAnArray();
        System.out.println(line);
        System.out.println(actionsOnAnArray.sumElements(line));
        StringParsing stringParsing = new StringParsing();
        stringParsing.parsesStringForParity(line);
    }
}
