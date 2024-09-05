package creational.prototype;
/*Padrão Prototype: É utilizado para criar novos objetos copiando
um objeto existente, conhecido como protótipo. Isso é útil quando a criação de
um objeto é mais complexa do que a simples clonagem de um já existente.
O padrão define uma interface para clonagem, permitindo que o cliente clone
objetos sem precisar conhecer suas classes concretas.
 */

// Interface Prototype com o método clone()
interface Prototype extends Cloneable {
    Prototype clone();
}



