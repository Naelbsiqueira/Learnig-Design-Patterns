package creational.prototype;


public class MainPrototype {
    public static void main(String[] args) {
    Car originalCar = new Car("Ferrari", "red");
    System.out.println("Original Car: " + originalCar);

    // Clonando o carro
    Car clonedCar = (Car) originalCar.clone();
    clonedCar.setColor("blue");
    System.out.println("Cloned Car: " + clonedCar);
}
}
