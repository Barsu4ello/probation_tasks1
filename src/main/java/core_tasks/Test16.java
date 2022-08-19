package core_tasks;

import java.util.*;

public class Test16 {
    public static void main(String[] args) {
        Integer [] array = {1, 2, 3, 4, 5, 6};

        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        List<Integer> list1 = Arrays.asList(array);

//        Collections.shuffle(list);
//        System.out.println(list);
//        System.out.println(Arrays.toString(array));

        Collections.shuffle(list1);
        System.out.println(list1);
        System.out.println(Arrays.toString(array));
    }
}
