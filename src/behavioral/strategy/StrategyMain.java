package behavioral.strategy;
/*Padrão Strategy: Encapsula diferentes algoritmos em classes separadas, permitindo
que sejam trocados dinamicamente. O objeto cliente escolhe qual estratégia usar,
sem alterar sua estrutura interna. Isso promove flexibilidade e simplifica a manutenção
ao evitar múltiplas condicionais no código. É usado quando diferentes comportamentos
precisam ser aplicados em tempo de execução.*/

public class StrategyMain {
    public static void main(String[] args) {
        Game game = new Game();
        game.toPlay();
        game.setStrategy(new Hard());
        game.toPlay();
    }
}
