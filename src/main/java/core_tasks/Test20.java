package core_tasks;

public class Test20 {
    public static void main(String[] args) {
        String s = "aaaaa";
        System.out.println(s.matches("a+a"));   //жадный
        System.out.println(s.matches("a++a"));  //очень жадный :)
        System.out.println(s.matches("a+?a"));  //ленивый
    }
}
