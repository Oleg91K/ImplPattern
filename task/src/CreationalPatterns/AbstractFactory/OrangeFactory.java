package CreationalPatterns.AbstractFactory;

public class OrangeFactory implements AbstractFactory{
    @Override
    public IceCream getIceCream() {
        return new OrangeIceCream();
    }

    @Override
    public Lemonade getLemonade() {
        return new OrangeLemonade();
    }
}
