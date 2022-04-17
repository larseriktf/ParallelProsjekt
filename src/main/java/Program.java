import Parallel.CountUniqueParallel;
import Serial.CountUniqueSerial;
import helper.FileHandler;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        System.out.println("Reading array from file...");
        int[] data = FileHandler.generateArrayFromFile("testcases/input/testcase6.txt");

        int iterations = 10;
        int processors = 4; // Runtime.getRuntime().availableProcessors()
        long startTime, endTime, serTime = 0, parTime = 0;
        int serUniqueCount = 0, parUniqueCount = 0;

        System.out.println("Counting unique values...");

        // Serial
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++)
            serUniqueCount = CountUniqueSerial.count(Arrays.copyOf(data, data.length));

        endTime = System.currentTimeMillis();
        serTime = (endTime - startTime) / iterations;

        // Parallel
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++)
            parUniqueCount = CountUniqueParallel.count(Arrays.copyOf(data, data.length), processors);

        endTime = System.currentTimeMillis();
        parTime = (endTime - startTime) / iterations;

        // Print Unique Count
        System.out.print("\n");
        System.out.println("Iterations: " + iterations);
        System.out.println("Unique numbers (Serial)    : " + serUniqueCount);
        System.out.println("Unique numbers (Parallel)  : " + parUniqueCount);

        // Print Running Time
        System.out.println("Average running Time (Serial)      : " + serTime + " ms");
        System.out.println("Average running Time (Parallel)    : " + parTime + " ms");

        // Print Speedup
        double speedup = (double) serTime / (double) parTime;
        System.out.println("Speedup: " + speedup);

        // Print Efficiency
        double efficiency = speedup / (double) processors;
        System.out.println("Efficiency: " + efficiency);
    }
}