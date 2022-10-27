package StructuralPatterns.Decorator;

abstract class Decorator implements Car{
    final Car car;

    public Decorator(Car car) {
        this.car = car;
    }


}
