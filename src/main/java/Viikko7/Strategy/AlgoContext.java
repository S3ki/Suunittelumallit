package Viikko7.Strategy;

public class AlgoContext {
    private AlgoStrategy strategy;


    public void setStrategy(AlgoStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] array) {
        strategy.sort(array);
    }
}
