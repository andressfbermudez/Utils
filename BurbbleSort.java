import java.util.Arrays;

public class BurbbleSort {

    public static void main(String[] args) {
        int[] numbers = {9, 5, 6, 2, 4, 1, 8, 7, 3};
        bubbleSort(numbers);
    }

    public static void bubbleSort(int[] array) {
        int longitudArray = array.length;

        for (int i = 0; i < array.length; i++) {

            boolean changes = false;
            System.out.println(Arrays.toString(array));

            for (int j = 0; j < (longitudArray - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    changes = true;
                }
            }

            if (!changes) {
                break;
            }
        }
    }
}
