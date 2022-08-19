package core_tasks;

import java.util.Arrays;

public class Test24 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        System.out.println(array1==array2);
        System.out.println(array1.equals(array2));
        System.out.println(Arrays.equals(array1,array2));

        Integer[] array3 = {1,2,300};
        Integer[] array4 = {1,2,300};
        System.out.println(array3==array4);
        System.out.println(array3.equals(array4));
        System.out.println(Arrays.equals(array3,array4));

        String[] array5 = {"aa","bb","cc"};
        String[] array6 = {new String("aa"),new String("bb"),new String("cc")};
        System.out.println(array5==array6);
        System.out.println(array5.equals(array6));
        System.out.println(Arrays.equals(array5,array6));
    }
}
