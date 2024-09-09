package creational.abstractfactory;

import creational.abstractfactory.economy.CarEconomy;
import creational.abstractfactory.economy.MotorcycleEconomy;

public class EconomyVehicleFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new CarEconomy();
    }
    @Override
    public Motorclycle createMotorclycle() {

        return new MotorcycleEconomy();
    }



}
