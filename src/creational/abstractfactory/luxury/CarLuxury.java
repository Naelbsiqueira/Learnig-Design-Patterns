package creational.abstractfactory.luxury;

import creational.abstractfactory.Car;

public class CarLuxury implements Car {
    @Override
    public String description() {
        return "Luxury Car";
    }
}
