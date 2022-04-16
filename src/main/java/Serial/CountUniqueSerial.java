package Serial;

import helper.QuickSort;

public class CountUniqueSerial {

    public static int count(int[] numbers) {
        QuickSort.quickSort(numbers, 0, numbers.length);

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
