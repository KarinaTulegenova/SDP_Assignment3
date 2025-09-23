public class CoffeeMachine {
    public void CreateDrink() {
        Powder coffee = new CoffeePowder();
        coffee.getPowder();

        System.out.println("-----");

        Powder cocoaAsCoffee = new CocoaPowderAdapter(new CocoaPowder());
        cocoaAsCoffee.getPowder();
    }
}
