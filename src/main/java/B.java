import java.util.Collection;

interface B {


    default Integer someMethod(){
        System.out.println("someMethod() from B");

        return 1;
    }

}
