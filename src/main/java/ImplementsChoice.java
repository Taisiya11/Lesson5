/**
 * Класс анализа выбранного пункта меню и присвоение его стоимости
 */
public class ImplementsChoice {
    EnteringValues enteringValues = new EnteringValues();
    int values = enteringValues.numberMenu();
    int selectedItem;
    public int selectsMenuItem() {
        CostOfDrinks tea = new TeaCost();
        CostOfDrinks coffee = new CoffeeCost();
        CostOfDrinks teaMilkCost = new TeaMilkCost();
        CostOfDrinks coffeeMilkCost = new CoffeeMilkCost();
        CostOfDrinks teaMilkCinnamon = new TeaMilkCinnamon();
        CostOfDrinks coffeeMilkCinnamon = new CoffeeMilkCinnamon();

        if (values == 1) {
            selectedItem=tea.calculatesCost();
        }
        if (values == 2) {
            selectedItem=coffee.calculatesCost();
        }
        if (values == 3) {
            selectedItem=teaMilkCost.calculatesCost();
        }
        if (values == 4) {
            selectedItem=coffeeMilkCost.calculatesCost();
        }
        if (values == 5) {
            selectedItem=teaMilkCinnamon.calculatesCost();
        }
        if (values == 6) {
            selectedItem=coffeeMilkCinnamon.calculatesCost();
        }
        return selectedItem;
    }
}
