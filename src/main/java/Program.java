import Parallel.CountUniqueParallel;
import Serial.CountUniqueSerial;
import helper.FileHandler;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        int[] data = FileHandler.generateArrayFromFile("testcases/testing/testcase10.txt");

        int processors = Runtime.getRuntime().availableProcessors();
        long startTime, endTime, serTime, parTime;
        int serUniqueCount, parUniqueCount;

        // Serial
        startTime = System.currentTimeMillis();
        serUniqueCount = CountUniqueSerial.count(Arrays.copyOf(data, data.length));
        endTime = System.currentTimeMillis();
        serTime = endTime - startTime;

        // Parallel
        startTime = System.currentTimeMillis();
        parUniqueCount = CountUniqueParallel.count(Arrays.copyOf(data, data.length), processors);
        endTime = System.currentTimeMillis();
        parTime = endTime - startTime;

        // Print Unique Count
        System.out.print("\n");
        System.out.println("Unique numbers (Serial)    : " + serUniqueCount);
        System.out.println("Unique numbers (Parallel)  : " + parUniqueCount);

        // Print Running Time
        System.out.println("Running Time (Serial)      : " + serTime);
        System.out.println("Running Time (Parallel)    : " + parTime);

        // Print Speedup
        double speedup = (double) serTime / (double) parTime;
        System.out.println("Speedup: " + speedup);

        // Print Efficiency
        double efficiency = speedup / (double) processors;
        System.out.println("Efficiency: " + efficiency);
    }
}