package Parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class CountUniqueTask extends RecursiveAction {

    private final int[] numbers;
    private final int start;
    private final int end;
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
            // System.out.println(start + " " + end);

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
            // Split into left and right task on the closest number difference
            int split = (start + end) / 2;


            // [ 0 1 1 4 4 4 4 5 8 9 ]
            while (numbers[split] == numbers[split + 1]) {
                split++;
            }

            //System.out.println(numbers[split - 1] + "///" + numbers[split] + "///" + numbers[split+1]);

            CountUniqueTask left = new CountUniqueTask(numbers, start, split);
            CountUniqueTask right = new CountUniqueTask(numbers, split, end);

            invokeAll(left, right);

            // Add sum
            sum = left.getSum() + right.getSum();
        }
    }

    public int getSum() {
        return sum;
    }
}
