package CreationalPatterns.AbstractFactory;

public class VanillaFactory implements AbstractFactory{
    @Override
    public IceCream getIceCream() {
        return new VanillaIceCream();
    }

    @Override
    public Lemonade getLemonade() {
        return new VanillaLemonade();
    }
}
