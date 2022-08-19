package core_tasks;

public class Test9 {

    public static void main(String[] args) {
        Test9 test = new Test9Extends();
        test.someMethod();
        test.someMethod1();
        test.someMethod2();
    }

    private void someMethod() {
        System.out.println("someMethod() from Test9");
    }

    public static void someMethod1() {
        System.out.println("someMethod1() from Test9");
    }

    final void someMethod2() {
        System.out.println("someMethod2() from Test9");
    }
}


class Test9Extends extends Test9{

    public void someMethod() {
        System.out.println("someMethod() from Test9Extends");
    }

    public static void someMethod1() {
        System.out.println("someMethod1() from Test9Extends");
    }

//    void someMethod2() {
//        System.out.println("someMethod2() from Test9Extends");
//    }
}

