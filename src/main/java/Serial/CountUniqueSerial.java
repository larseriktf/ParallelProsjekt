package Serial;

import java.util.ArrayList;
import java.util.Arrays;

public class CountUniqueSerial {

    public static int count(int[] numbers) {
        //Arrays.sort(numbers);

        ArrayList<Integer> unique = new ArrayList<>();
        int sum = 0;

        int lastN = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n != lastN) {
                lastN = n;
                sum++;
            }
        }

        /*
        for (int currentN : numbers) {
            if (currentN != lastN) {
                lastN = currentN;
                unique.add(currentN);
            }
        }
         */

        return sum;
        //return unique.size();
    }
}
