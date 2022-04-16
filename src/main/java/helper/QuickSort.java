package helper;

public class QuickSort {
    public static void quickSort(int data[], int start, int end) {
        if(start < end)
        {
            int split =  partition(data, start, end);

            quickSort(data, start, split);
            quickSort(data, split + 1, end);

        }
    }

    public static int partition(int[] data, int start, int end) {
        int pivot = data[start];
        int split = start;

        for (int i = start + 1; i < end; i++) {
            if(data[i] <= pivot) {
                split++;
                swap(data, i, split);
            }
        }

        swap(data, start, split);

        return split;
    }

    private static void swap(int[] data, int index1, int index2) {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}
