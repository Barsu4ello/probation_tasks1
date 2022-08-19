package core_tasks.pecs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Class1> list1 = new ArrayList<>(Arrays.asList(
                new Class1(), new Class3(), new Class6()));

        List<Class6> list2 = new ArrayList<>(Arrays.asList(
                new Class6(), new Class6(), new Class6()));

        producerExtends(list2);
        consumerSuper(list1);

    }

    static void producerExtends(List<? extends Class3> list) {
//        Class3 class3 = list.get(1);
//        Class4 class4 = list.get(1);
//        Class5 class5 = (Class6) list.get(1);
//        list.add(new Class6());
    }


    static void consumerSuper(List<? super Class3> list) {
//        list.add(new Class3());
//        list.add(new Class2());
//        list.add((Class3) new Class2());
//        list.add(new Class4());
    }
}

class Class1 {
}

class Class2 extends Class1 {
}

class Class3 extends Class2 {
}

class Class4 extends Class3 {
}

class Class5 extends Class4 {
}

class Class6 extends Class5 {
}
