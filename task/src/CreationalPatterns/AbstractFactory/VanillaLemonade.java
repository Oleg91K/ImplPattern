package CreationalPatterns.AbstractFactory;

public class VanillaLemonade implements Lemonade{
    @Override
    public void getName() {
        System.out.println("Ванильный лимонад");
    }

    @Override
    public void getPrice() {
        System.out.println("70");

    }
}
