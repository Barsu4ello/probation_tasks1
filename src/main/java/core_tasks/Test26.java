package core_tasks;

import java.util.Arrays;

public class Test26 {
    public static void main(String[] args) {
        int[] array = new int[] {20,21,7,10};
        int position = Arrays.binarySearch(array,10);
        System.out.println(Arrays.toString(array));
        System.out.println(position);
    }
}
