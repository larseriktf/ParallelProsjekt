package Serial;

import helper.QuickSort;

import java.util.Arrays;

public class CountUniqueSerial {

    public static int count(int[] numbers) {
        QuickSort.quickSort(numbers, 0, numbers.length);

        /*
        System.out.println(Arrays.toString(numbers));
        System.out.print("\n");
         */

        int sum = 0;

        int lastN = Integer.MAX_VALUE;
        for (int n : numbers) {
            if (n != lastN) {
                lastN = n;
                sum++;
            }
        }

        return sum;
    }
}
