package Parallel;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class CountUniqueParallel {

    public static int count(int[] numbers, int parallelism) {
        Arrays.sort(numbers);

        CountUniqueTask task = new CountUniqueTask(numbers, 0, numbers.length);
        ForkJoinPool pool = new ForkJoinPool(parallelism);
        pool.invoke(task);

        return numbers.length;
    }
}
