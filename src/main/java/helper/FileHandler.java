package helper;

import java.io.File;
import java.util.Scanner;

public class FileHandler {
    public static int[] generateArrayFromFile(String uri) {
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
