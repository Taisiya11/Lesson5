import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * Класс тестирования реализации кофемашины
 */
public class CoffeeMachineTest {
    @Test
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
    @Test
    public void testImplementsChoice() {
        ImplementsChoice implementsChoice = new ImplementsChoice();
        Assert.assertEquals(implementsChoice.selectsMenuItem(1),8);
        Assert.assertEquals(implementsChoice.selectsMenuItem(2),10);
        Assert.assertEquals(implementsChoice.selectsMenuItem(3),15);
        Assert.assertEquals(implementsChoice.selectsMenuItem(4),13);
        Assert.assertEquals(implementsChoice.selectsMenuItem(5),15);
        Assert.assertEquals(implementsChoice.selectsMenuItem(6),17);
    }
}
