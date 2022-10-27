package CreationalPatterns.FactoryMethod;

import CreationalPatterns.FactoryMethod.Dog;

public class RoyalPoodle implements Dog {
    private final int price = 150000;

    @Override
    public void getPrice() {
        System.out.println("Цена королевского пуделя: " + price);

    }
}
