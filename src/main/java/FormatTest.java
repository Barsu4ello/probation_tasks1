public class FormatTest {
    public static void main(String[] args) {
        String s = fill();
        max(s);
        min(s);
        exciting(s);

    }

    private static String fill() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 1000_000_0; i++) {
            s.append("aaaaaaa");
        }
        return s.toString();
    }

    public static void max(String s) {
        long start = System.currentTimeMillis();
        boolean b = s.matches("a+aaaaaaaa");
        long result = System.currentTimeMillis() - start;
        System.out.println("max: " + b + " " + result);
    }

    public static void min(String s) {
        long start = System.currentTimeMillis();
        boolean b = s.matches("a+?aaaaaaaa");
        long result = System.currentTimeMillis() - start;
        System.out.println("min: " + b + " " + result);
    }

    public static void exciting(String s) {
        long start = System.currentTimeMillis();
        boolean b = s.matches("a++aaaaaaaa");
        long result = System.currentTimeMillis() - start;
        System.out.println("exciting: " + b + " " + result);
    }
}
