package Parallel;

import java.util.concurrent.ForkJoinPool;

public class CountUniqueParallel {

    public static int count(int[] numbers, int parallelism) {
        CountUniqueTask task = new CountUniqueTask(numbers, 0, numbers.length - 1);
        ForkJoinPool pool = new ForkJoinPool(parallelism);
        pool.invoke(task);

        return task.getSum();
    }
}
