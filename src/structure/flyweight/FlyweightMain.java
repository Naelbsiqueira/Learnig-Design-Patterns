package structure.flyweight;
/*Padrão Flyweight: Otimiza o uso de memória compartilhando objetos
(imutáveis/estado intrínseco) semelhantes para reduzir o consumo de recursos.
Ele armazena dados comuns, instrínseco, externamente e cria instâncias únicas
para atributos variáveis (dados extrínseco). Isso é útil quando muitos objetos
semelhantes precisam ser criados.*/

import structure.flyweight.pack.CharFactory;
import structure.flyweight.pack.CharacterFlyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightMain {
    public static void main(String[] args) {
        List<CharacterFlyweight> memoryText = new ArrayList<>();
        String txt = "este é um texto onde as letras repetem";

        // Usar CharFactory para obter os objetos flyweight
        System.out.println("Tamanho do texto = " + txt.length());
        for (char c : txt.toCharArray()) {
            memoryText.add(CharFactory.getFlyweight(c));
        }

        // Exemplo de uso de print
        for (CharacterFlyweight character : memoryText) {
            character.print(" | ");
        }
        System.out.println("");
        System.out.println("Quantidade de Instâncias = " + CharacterFlyweight.getCountInstance());
    }
}
