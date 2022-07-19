public class SortingContext {
    private Sorter strategy;

    public SortingContext(Sorter strategy) {
        this.strategy = strategy;
    }

    public void execute(int[] arr){
        strategy.sort(arr);
    }
}
