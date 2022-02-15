import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * Класс тестирования реализации кофемашины
 */
public class CoffeeMachineTest {
    @Test
//    Не удалось протестировать саму реализацию выбора напитка(класс ImplementsChoice) из-за переменной, которая вводится с клавиатуры
//    и обозначает выбранный пунут меню. Так как в метод я ее не передаю и не могу в тесте задать новое значение.
//    Наверное код надо делать еще более гибким.
    public void testsCoffeeMachine() {
        CostOfDrinks coffeeCost = new CoffeeCost();
        CostOfDrinks teaCost = new TeaCost();
        CostOfDrinks coffeeMilkCost = new CoffeeMilkCost();
        CostOfDrinks teaMilkCost = new TeaMilkCost();
        CostOfDrinks coffeeMilkCinnamon = new CoffeeMilkCinnamon();
        CostOfDrinks teaMilkCinnamon = new TeaMilkCinnamon();
        ImplementsChoice implementsChoice = new ImplementsChoice();

        Assert.assertEquals(CostOfDrinks.COFFEE, 10);
        Assert.assertEquals(CostOfDrinks.TEA, 8);
        Assert.assertEquals(CostOfDrinks.MILK, 5);
        Assert.assertEquals(CostOfDrinks.CINNAMON, 2);
        Assert.assertEquals(coffeeCost.calculatesCost(), 10);
        Assert.assertEquals(teaCost.calculatesCost(), 8);
        Assert.assertEquals(coffeeMilkCost.calculatesCost(), 15);
        Assert.assertEquals(teaMilkCost.calculatesCost(), 13);
        Assert.assertEquals(coffeeMilkCinnamon.calculatesCost(), 17);
        Assert.assertEquals(teaMilkCinnamon.calculatesCost(), 15);
    }
}
