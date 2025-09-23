public class CoffeePowder implements Powder {
    @Override
    public void getPowder(){
        System.out.println("Machine added coffee powder...");
        DrinkMessages.ready();
    }
}