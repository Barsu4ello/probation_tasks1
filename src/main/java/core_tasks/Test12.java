package core_tasks;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@TestAnnotation(name = "somename")
public class Test12 {

    public static void main(String[] args) {
        Class myClass = Test12.class;
        Annotation[] annotations = myClass.getAnnotations();

        for(Annotation annotation:annotations){
            if(annotation instanceof TestAnnotation) {
                System.out.println((annotation.annotationType().getName()));
            }
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation{
    String name();
}
