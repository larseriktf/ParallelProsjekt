package Parallel;

import helper.QuickSort;

import java.util.concurrent.RecursiveAction;

public class CountUniqueTask extends RecursiveAction {

    private final int[] numbers;
    private final int start, end;
    private final int threshold = 10_000;
    private int sum = 0;

    public CountUniqueTask(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        // lower than threshold or array with all duplicates
        // to prevent infinite sorting
        if ((end - start <= threshold) || (numbers[start] == numbers[end])) {
            QuickSort.quickSort(numbers, start, end + 1);
            countUnique();
        } else {
            int split = QuickSort.partition(numbers, start, end + 1);

            CountUniqueTask left = new CountUniqueTask(numbers, start, split);
            CountUniqueTask right = new CountUniqueTask(numbers, split + 1, end);

            invokeAll(left, right);

            sum = left.getSum() + right.getSum();
        }
    }

    private void countUnique() {
        int lastN = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            int n = numbers[i];
            if (n != lastN) {
                lastN = n;
                sum++;
            }
        }
    }

    public int getSum() {
        return sum;
    }
}
