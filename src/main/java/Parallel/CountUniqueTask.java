package Parallel;

import java.util.concurrent.RecursiveAction;

public class CountUniqueTask extends RecursiveAction {

    private int[] numbers;
    private int start, end;
    private int sum = 0;
    private final int threshold = 100_000;

    public CountUniqueTask(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start <= threshold) {
            // Compute directly when workload is less than threshold
            int lastN = Integer.MAX_VALUE;
            for (int i = start; i < end; i++) {
                int n = numbers[i];
                if (n != lastN) {
                    lastN = n;
                    sum++;
                }
            }
        } else {
            // Assume integer array is sorted
            // Split into left and right task on the closes number difference

            int split = (end - start) / 2;

            while (split == numbers[split + 1]) {
                split++;
            }

            CountUniqueTask left = new CountUniqueTask(numbers, start, split);
            CountUniqueTask right = new CountUniqueTask(numbers, split, end);

            invokeAll(left, right);

            // Add sum
            sum = left.getSum() + right.getSum();
        }
    }

    private int getSum() {
        return sum;
    }
}
