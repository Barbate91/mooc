import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest)
                smallest = array[i];
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                idx = i;
            }
        }
        return idx;
    }

    public static int indexOfSmallestFrom(int[] array, int startIdx) {
        int smallest = array[startIdx];
        int idx = startIdx;
        for (int i = startIdx; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                idx = i;
            }
        }
        return idx;
    }

    public static void swap(int[] array, int idx1, int idx2) {
        int first = array[idx1];
        int second = array[idx2];
        array[idx1] = second;
        array[idx2] = first;
    }

    public static void sort(int[] array) {
        int startIdx;
        for (int i = 0; i < array.length; i++) {
            startIdx = indexOfSmallestFrom(array,i);
            swap(array,startIdx,i);
        }
    }
}
