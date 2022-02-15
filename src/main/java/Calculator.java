//По ошибке выгрузки кода на github данный класс будет называться калькулятором

/**
 * Класс вывода всех напитков из кофемашины
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("1. кофе\n2. чай\n3. кофе с молоком\n4. чай с молоком\n5. кофе с молоком и корицей\n6. чай с молоком и корицей");
        System.out.println("Введите выбранный пункт напитка:");
        ImplementsChoice implementsChoice = new ImplementsChoice();
        EnteringValues enteringValues = new EnteringValues();
        int values = enteringValues.numberMenu();
        implementsChoice.selectsMenuItem(values);
        System.out.println("Итоговая стоимость: " + implementsChoice.selectsMenuItem(values));
    }
}
