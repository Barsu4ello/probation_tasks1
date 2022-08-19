package core_tasks;

import java.util.Arrays;
import java.util.List;

public class Test15 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};

        int [] arrayResult1 = Arrays.stream(array).filter(element -> element%2 == 0).toArray();
        System.out.println(Arrays.toString(arrayResult1));

        int [] arrayResult2 = Arrays.stream(array).filter(element -> element%2 != 0).toArray();
        System.out.println(Arrays.toString(arrayResult2));
    }
}
