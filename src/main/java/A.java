import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public interface A {

    default Number someMethod(){
        System.out.println("someMethod() from A");
        return null;
    }
}
