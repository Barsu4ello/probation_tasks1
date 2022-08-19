package core_tasks;

import java.util.*;

public class Test25 {
    private static Random random = new Random();
    public int a = random.nextInt(100);

    public static void main(String[] args) {
        Test25[] array = {new Test25(), new Test25(), new Test25(), new Test25()};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }

    @Override
    public String toString() {
        return "Test25{" +
                "a=" + a +
                '}';
    }

}
















//class Test25Comparator implements Comparator<Test25> {
//
//    @Override
//    public int compare(Test25 a, Test25 o) {
//        if(a.a < o.a) {
//            return -1;
//        } else if (a.a > o.a) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
//}
