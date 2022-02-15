/**
 * Класс вывода в консоль слова "Не работает"
 */
public class NotWorkAction implements IAction {
    @Override
    public void doAction() {
        System.out.println("Не работает");
    }
}
