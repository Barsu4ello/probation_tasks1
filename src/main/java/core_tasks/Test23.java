package core_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Test23 {
    public static void main(String[] args) {
        int[] array1 = {1,1,1,1,1};
        int[] array2 = {2,2,2,2,2};
        System.arraycopy(array1,0,array2,2,3);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
