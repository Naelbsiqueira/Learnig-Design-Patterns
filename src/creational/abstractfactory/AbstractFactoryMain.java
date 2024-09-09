package creational.abstractfactory;
/* Abstract Factory: Fornece uma interface para criar famílias de
objetos relacionados sem especificar suas classes concretas.
Ele permite que o sistema seja independente de como os produtos
são criados e combinados. Cada família de produtos é criada por
uma fábrica específica que implementa a interface abstrata.
Assim, é possível trocar a família de produtos sem alterar o código cliente.*/
public class AbstractFactoryMain {
        public static void main(String[] args) {
            VehicleFactory luxuryFactory = new LuxuryVehicleFactory();
            VehicleFactory economyFactory = new EconomyVehicleFactory();

            System.out.println("Luxury Vehicle Factory:");
            printVehicleDetails(luxuryFactory);

            System.out.println("\nEconomy Vehicle Factory:");
            printVehicleDetails(economyFactory);
        }
    private static void printVehicleDetails(VehicleFactory factory) {
        Car car = factory.createCar();
        Motorclycle motorcycle = factory.createMotorclycle();
        System.out.println("Car: " + car.description());
        System.out.println("Motorcycle: " + motorcycle.description());
    }

    }


