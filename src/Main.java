import java.util.Arrays;

public class Main {
    static int[] list = {10, 23, 65, 95, 32, 5, 42, 63, 89};

    public static void main(String[] args) {
        System.out.println("Original list: ");
        System.out.println(Arrays.toString(list));
        System.out.println("After insertion Sort: ");
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
        }
    }
}
