import Serial.CountUniqueSerial;

import java.util.Arrays;
import java.util.Random;

public class Program {
    // Count the number of unique values in an integer array A[N].
    // Values of the array A[N] are from an input file.
    private static final int[] numbers = generateArray(1_000_000);

    public static void main(String[] args) {
        System.out.println("Testing");
        System.out.println(CountUniqueSerial.count(numbers));

        // System.out.println(Arrays.toString(numbers));

    }

    private static int[] generateArray(int length) {
        Random random = new Random();

        int[] a = new int[length];
        for (int i = 0; i < length; i++)
            a[i] = random.nextInt(-length, length);

        return a;
    }
}
