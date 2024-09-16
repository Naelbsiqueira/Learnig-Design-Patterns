package behavioral.strategy;

public class Game {
    private Strategy strategy;

    public Game() {
        this.strategy = new Easy()  ;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void toPlay(){
        strategy.toPlay();
    }
}
