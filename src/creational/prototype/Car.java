package creational.prototype;
/*Padrão Prototype: É utilizado para criar novos objetos copiando
um objeto existente, conhecido como protótipo. Isso é útil quando a criação de
um objeto é mais complexa do que a simples clonagem de um já existente.
O padrão define uma interface para clonagem, permitindo que o cliente clone
objetos sem precisar conhecer suas classes concretas.*/

class Car implements Prototype {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Implementa o método clone() da interface Prototype
    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    // Getters e setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return model + " in " + color;
    }
}
