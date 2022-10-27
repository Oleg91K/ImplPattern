package CreationalPatterns.AbstractFactory;

public class VanillaIceCream implements IceCream{
    @Override
    public void getName() {
        System.out.println("Ванильное мороженое");
    }

    @Override
    public void getPrice() {
        System.out.println("50");
    }
}
