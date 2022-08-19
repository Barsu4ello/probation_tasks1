package core_tasks;

public class Test28 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    private static int f(int a) {
        if (a > 0) {
            a = f(a);
        }
        return a;
    }
}
