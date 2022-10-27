package CreationalPatterns.AbstractFactory;

public class OrangeLemonade implements Lemonade{
    @Override
    public void getName() {
        System.out.println("Апельсиновый лимонад");
    }

    @Override
    public void getPrice() {
        System.out.println("80");

    }
}
