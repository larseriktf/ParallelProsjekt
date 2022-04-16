import static org.junit.Assert.*;

import Serial.CountUniqueSerial;
import helper.FileHandler;
import org.junit.Test;

public class validate_count_unique_serial {

    @Test
    public void correctResultForTestcase1() {
        int[] array = FileHandler.generateArrayFromFile("testcases/testing/testcase1.txt");
        int uniqueValues = CountUniqueSerial.count(array);
        assertEquals(uniqueValues, 5784216);
    }

    @Test
    public void correctResultForTestcase2() {
        int[] array = FileHandler.generateArrayFromFile("testcases/testing/testcase2.txt");
        int uniqueValues = CountUniqueSerial.count(array);
        assertEquals(uniqueValues,1764866);
    }

    @Test
    public void correctResultForTestcase3() {
        int[] array = FileHandler.generateArrayFromFile("testcases/testing/testcase3.txt");
        int uniqueValues = CountUniqueSerial.count(array);
        assertEquals(uniqueValues,6280309);
    }

    @Test
    public void correctResultForTestcase4() {
        int[] array = FileHandler.generateArrayFromFile("testcases/testing/testcase4.txt");
        int uniqueValues = CountUniqueSerial.count(array);
        assertEquals(uniqueValues,3128412);
    }

    @Test
    public void correctResultForTestcase5() {
        int[] array = FileHandler.generateArrayFromFile("testcases/testing/testcase5.txt");
        int uniqueValues = CountUniqueSerial.count(array);
        assertEquals(uniqueValues,4912306);
    }

    @Test
    public void correctResultForTestcase6() {
        int[] array = FileHandler.generateArrayFromFile("testcases/testing/testcase6.txt");
        int uniqueValues = CountUniqueSerial.count(array);
        assertEquals(uniqueValues,6267464);
    }

    @Test
    public void correctResultForTestcase7() {
        int[] array = FileHandler.generateArrayFromFile("testcases/testing/testcase7.txt");
        int uniqueValues = CountUniqueSerial.count(array);
        assertEquals(uniqueValues,3563395);
    }

    @Test
    public void correctResultForTestcase8() {
        int[] array = FileHandler.generateArrayFromFile("testcases/testing/testcase8.txt");
        int uniqueValues = CountUniqueSerial.count(array);
        assertEquals(uniqueValues,6181753);
    }

    @Test
    public void correctResultForTestcase9() {
        int[] array = FileHandler.generateArrayFromFile("testcases/testing/testcase9.txt");
        int uniqueValues = CountUniqueSerial.count(array);
        assertEquals(uniqueValues,6286057);
    }

    @Test
    public void correctResultForTestcase10() {
        int[] array = FileHandler.generateArrayFromFile("testcases/testing/testcase10.txt");
        int uniqueValues = CountUniqueSerial.count(array);
        assertEquals(uniqueValues,3014586);
    }
}
