package core_tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test27 {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5};
        List<Integer> integers = Arrays.asList(array);
//        integers.add(1);
//        integers.set(1,5);
//        System.out.println(integers);
//        System.out.println(Arrays.toString(array));
        List<Integer> integers1 = Collections.unmodifiableList(integers);
//        integers1.add(1);
//        integers1.set(1,5);
//        System.out.println(integers1);

    }
}
