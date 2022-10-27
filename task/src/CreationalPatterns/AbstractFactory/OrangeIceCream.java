package CreationalPatterns.AbstractFactory;

public class OrangeIceCream implements IceCream{
    @Override
    public void getName() {
        System.out.println("Апельсиновое мороженое");
    }

    @Override
    public void getPrice() {
        System.out.println("65");
    }
}
