package CreationalPatterns.FactoryMethod;

import CreationalPatterns.FactoryMethod.Dog;

public class ToyPoodle implements Dog {
    private final int price = 250000;

    @Override
    public void getPrice() {
        System.out.println("Цена той пуделя: " + price);
    }
}
