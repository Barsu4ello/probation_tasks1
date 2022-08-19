import core_tasks.Test2;

/** English
 * @author Muslim
 * @version 2.1
 * @since 2.0
 * See Also:
 * {@link Test2#main(String[])}*/
public class Person {

    String name;

    /**
     *
     * {@value}
     * @see Person#someMethod(String)
     * */
    int age;


    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println("---------------------------------------");
        System.out.println( System.getProperty("user.name"));
        System.out.println("---------------------------------------");
        System.out.println(System.getProperty("java.library.path"));

    }
    /** Somemethod
     * @param name - name
     * @return String
     * @exception Exception - if a=0
     * @throws Error - if a=0
     **/
    public static String someMethod(String name) throws Exception {
        System.out.println("b");
        return null;
    }

//    public void someMethod1() {
//        Test1 test1 = new Test1();
//        test1.someMethod1();
//    }
}
