package core_tasks;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Test13 {
    public static void main(String[] args) {
        String s = null;

        try {
            int a = parseInt(s);
            System.out.println(a);
        } catch (NumberFormatException | NullPointerException e){
            System.out.println(e.getClass());
        }

        try {
            double b = parseDouble(s);
            System.out.println(s);
        } catch (NumberFormatException e){
            System.out.println(e.getClass());
        }
    }
}
