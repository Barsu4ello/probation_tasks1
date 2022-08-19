package core_tasks;

public class Test4 {
    public static void main(String[] args) {
        f();
    }

    static void f(int... args){
        for (int i: args) {
            System.out.println(i);
        }
        System.out.println(args.getClass());
    }
}
