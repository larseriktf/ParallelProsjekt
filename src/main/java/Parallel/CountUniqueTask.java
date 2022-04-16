package Parallel;

import Serial.CountUniqueSerial;
import helper.QuickSort;

import java.util.concurrent.RecursiveAction;

public class CountUniqueTask extends RecursiveAction {

    private final int[] numbers;
    private final int start;
    private final int end;
    private int sum = 0;
    private final int threshold = 100;

    public CountUniqueTask(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end - start <= threshold) || (numbers[start] == numbers[end])){
            // Compute directly when workload is less than threshold
            //QuickSort.quickSort(numbers, start, end);
            countUnique();

        } else {
            // Assume integer array is sorted
            // Split into left and right task on the closest number difference

            int split = (start + end) / 2;
            while (numbers[split] == numbers[split + 1]) {
                split++;

                // If split reaches end, wrap around
                if (split == end) split = start;
            }

            // New Quicksort way
            // split = QuickSort.partition(numbers, start, end);

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
