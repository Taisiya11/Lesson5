/**
 * Класс вывода в консоль слова "Работает"
 */
public class WorkAction implements IAction {
    @Override
    public void doAction() {
        System.out.println("Работает");
    }
}
