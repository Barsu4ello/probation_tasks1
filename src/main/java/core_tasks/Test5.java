package core_tasks;

public class Test5 extends Test6{

    public static void main(String[] args) {
       new Test5().someMethod();
    }

    @Override
    protected void someMethod() {
        System.out.println("Дополнительная логика"); //любая логика
        someMethod();
    }
}

class Test6 {

    protected void someMethod() {
        System.out.println("Логика someMethod() класса Test6"); // любая логика
    }
}
