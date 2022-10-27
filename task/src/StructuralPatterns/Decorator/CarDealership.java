package StructuralPatterns.Decorator;

public class CarDealership {
    public static void main(String[] args) {
        //Есть BMW которая имплементирует интерфейс Car.Это машина была уже создана и нам нужен новый обьект,
        // чтообы не изменять старый,который будет возвращать цену со скидкой(у нас все поля final),
        Car bmwCar = new BmwCar(250,7_000_000,"x6",2018);
        System.out.println("Модель: " + bmwCar.getModel());
        System.out.println("Цена: " + bmwCar.getPrice());
        System.out.println("Год выпуска: " + bmwCar.getYearOfManufacture());
        System.out.println("Лошадиные силы: " + bmwCar.getHorsePower());
        System.out.println();
        Car bmwCarDiscount = new BmwDiscount(bmwCar);
        System.out.println("Модель: " + bmwCarDiscount.getModel());
        System.out.println("Цена с учетом скидки: " + bmwCarDiscount.getPrice());
        System.out.println("Год выпуска: " + bmwCarDiscount.getYearOfManufacture());
        System.out.println("Лошадиные силы: " + bmwCarDiscount.getHorsePower());
        System.out.println();


    }
}
