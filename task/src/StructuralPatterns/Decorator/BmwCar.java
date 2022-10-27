package StructuralPatterns.Decorator;

public class BmwCar implements Car {
    private final int horsePower;
    private final long price;
    private final String getModel;
    private final int yearOfManufacture;

    public BmwCar(final int horsePower, final long price, String getModel, int yearOfManufacture) {
        this.horsePower = horsePower;
        this.price = price;
        this.getModel = getModel;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String getModel() {
        return this.getModel;
    }

    @Override
    public int getYearOfManufacture() {
        return this.yearOfManufacture;
    }


    @Override
    public int getHorsePower() {
       return this.horsePower;
    }

    @Override
    public long getPrice() {
        return this.price;
    }


}
