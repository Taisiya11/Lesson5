import java.util.ArrayList;
import java.util.Arrays;

/**
 * Класс анализа работает или не работает.
 * Если единиц четное кол-во в строке, а нулей нечетное кол-во, то выводит “Работает”, в любом другом случае “Не работает”.
 */
public class StringParsing {
    ActionsOnAnArray actionsOnAnArray = new ActionsOnAnArray();
    IAction workAction = new WorkAction();
    IAction notWorkAction = new NotWorkAction();

    public void parsesStringForParity(ArrayList<Integer> line) {
        if (actionsOnAnArray.sumElements(line) % 2 == 0) {
            if (actionsOnAnArray.countsNumberOfZeros(line) % 2 != 0)
                workAction.doAction();
            else notWorkAction.doAction();
        } else {
            notWorkAction.doAction();
        }
    }
}
