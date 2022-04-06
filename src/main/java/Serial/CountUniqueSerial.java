package Serial;

import java.util.ArrayList;
import java.util.Arrays;

public class CountUniqueSerial {

    public static int count(int[] numbers) {
        Arrays.sort(numbers);

        ArrayList<Integer> unique = new ArrayList<>();

        int lastN = Integer.MAX_VALUE;
        for (int currentN : numbers) {
            if (currentN != lastN) {
                lastN = currentN;
                unique.add(currentN);
            }
        }

        return unique.size();
    }
}
