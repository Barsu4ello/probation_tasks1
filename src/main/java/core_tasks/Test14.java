package core_tasks;

import java.util.Arrays;
import java.util.List;

public class Test14 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.add(10);
        list.add(9);

        list.stream().filter(element -> element%2 == 0).forEach(System.out::println);
    }
}
