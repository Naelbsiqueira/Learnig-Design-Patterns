package creational.abstractfactory.economy;

import creational.abstractfactory.Car;

public class CarEconomy implements Car {
    @Override
    public String description() {
        return "Economy Car";
    }
}
