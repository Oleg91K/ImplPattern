package CreationalPatterns.FactoryMethod;

import CreationalPatterns.FactoryMethod.Dog;

public class DwarfPoodle implements Dog {
    private final int price = 60000;

    @Override
    public void getPrice() {
        System.out.println("Цена карликового пуделя: " + price);

    }
}
