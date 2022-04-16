import Parallel.CountUniqueParallel;
import Serial.CountUniqueSerial;

import java.io.File;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {
    // Count the number of unique values in an integer array A[N].
    // Values of the array A[N] are from an input file.
    //private static final int[] numbers = generateArray(1_000_000);
    // private static final int[] numbers = new int[]{-1,0,0,0,0,0,0,0,1,1,2,2,3,3,4,4,5};

    public static void main(String[] args) {
        int[] numbers = generateArrayFromFile("testcases/input/testcase2.txt");
        int[] numbers2 = generateArrayFromFile("testcases/input/testcase2.txt");

        //Print array
        //System.out.println(Arrays.toString(numbers));

        int processors = Runtime.getRuntime().availableProcessors();
        long startTime, endTime, serTime, parTime;
        int serUniqueCount, parUniqueCount;

        // Serial
        startTime = System.currentTimeMillis();
        serUniqueCount = CountUniqueSerial.count(numbers);
        endTime = System.currentTimeMillis();
        serTime = endTime - startTime;

        // Parallell
        startTime = System.currentTimeMillis();
        parUniqueCount = CountUniqueParallel.count(numbers2, processors);
        endTime = System.currentTimeMillis();
        parTime = endTime - startTime;

        // Print Unique Count
        System.out.println("Unique numbers (Serial)    : " + serUniqueCount);
        System.out.println("Unique numbers (Parallell) : " + parUniqueCount);

        // Print Running Time
        System.out.println("Running Time (Serial)      : " + serTime);
        System.out.println("Running Time (Parallell)   : " + parTime);

        // Print Speedup
        double speedup = (double) serTime / (double) parTime;
        System.out.println("Speedup: " + speedup);

        // Print Efficiency
        double efficiency = speedup / (double) processors;
        System.out.println("Efficiency: " + efficiency);

    }

    private static int[] generateArray(int length) {
        Random random = new Random();

        int[] a = new int[length];
        for (int i = 0; i < length; i++)
            a[i] = random.nextInt(-length, length);

        return a;
    }

    private static int[] generateArrayFromFile(String uri) {
        int[] n = new int[0];
        try {
            Scanner sc = new Scanner(new File(uri));

            n = new int[sc.nextInt()];

            int counter = 0;
            while(sc.hasNextInt()) {
                n[counter] = sc.nextInt();
                counter++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return n;
    }
}
