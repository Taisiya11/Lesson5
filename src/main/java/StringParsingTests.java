import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Класс тестирования реализации подсчета суммы и количества нулей в массиве
 */
public class StringParsingTests {
    @Test
    public void testBinaryString(){
        ArrayList<Integer> line = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1, 0, 0,1));
        ActionsOnAnArray actionsOnAnArray = new ActionsOnAnArray();
        Assert.assertEquals(actionsOnAnArray.countsNumberOfZeros(line),3);
        Assert.assertEquals(actionsOnAnArray.sumElements(line),4);
    }
}
