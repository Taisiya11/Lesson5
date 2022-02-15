import java.util.ArrayList;
import java.util.Arrays;

/**
 * Класс с методами подсчета суммы и количества нулей в массиве
 */
public class ActionsOnAnArray {
    int sum = 0;
    int count = 0;

    public int sumElements(ArrayList<Integer> line) {
        for (int i = 0; i < line.size(); i++) {
            sum += line.get(i);
        }
        return sum;
    }

    public int countsNumberOfZeros(ArrayList<Integer> line) {
        for (int i = 0; i < line.size(); i++) {
            if (line.get(i) == 0) {
                count++;
            }
        }
        return count;
    }
}
