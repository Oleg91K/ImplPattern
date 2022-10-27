package StructuralPatterns.Decorator;

public class BmwDiscount extends Decorator{

    public BmwDiscount(Car car) {
        super(car);


    }

    @Override
    public String getModel() {
        return this.car.getModel();
    }

    @Override
    public int getYearOfManufacture() {
        return this.car.getYearOfManufacture();
    }

    @Override
    public int getHorsePower() {
        return this.car.getHorsePower();
    }

    @Override
    public long getPrice() {
        return this.car.getPrice() - 1_500_000;
    }
}
