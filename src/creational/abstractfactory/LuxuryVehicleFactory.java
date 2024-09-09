package creational.abstractfactory;

import creational.abstractfactory.luxury.CarLuxury;
import creational.abstractfactory.luxury.MotorcycleLuxury;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new CarLuxury();
    }

    @Override
    public Motorclycle createMotorclycle() {
        return new MotorcycleLuxury();
    }
}
