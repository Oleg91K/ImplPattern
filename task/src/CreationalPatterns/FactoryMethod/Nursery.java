package CreationalPatterns.FactoryMethod;

import CreationalPatterns.FactoryMethod.CreatorFactory;
import CreationalPatterns.FactoryMethod.Dog;
import CreationalPatterns.FactoryMethod.Factory;

import java.util.ArrayList;
import java.util.List;
//есть интерфейс получить цену собаки и три класса,которые реализовывают этот интерфейс
//у каждого разные цены и переопределенный метод
//Питомник создает экземпляры на основание фабрики,так как он не знает и для него создает класс фабрики
//В фактори логика выбора для возвращение цены собаки
public class Nursery {
    public static void main(String[] args) {
        Factory factory = new CreatorFactory(1);
        Dog dog = factory.create();
        dog.getPrice();
        Factory factory1 = new CreatorFactory(2);
        Dog dog1 = factory1.create();
        dog1.getPrice();
        Factory factory2 = new CreatorFactory(3);
        Dog dog2 = factory2.create();
        dog2.getPrice();

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);


    }
}
