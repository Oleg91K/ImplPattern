package CreationalPatterns.AbstractFactory;

public class Factory {
    public static void main(String[] args) {
        //абстрактная фабрика может создавать пару
        AbstractFactory vanillaFactory= new VanillaFactory();
        vanillaFactory.getIceCream().getName();
        vanillaFactory.getLemonade().getName();

        AbstractFactory orangeFactory = new OrangeFactory();
        orangeFactory.getIceCream().getName();
        orangeFactory.getLemonade().getName();
    }
}
