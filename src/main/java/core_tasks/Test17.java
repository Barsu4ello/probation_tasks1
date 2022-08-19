package core_tasks;

public class Test17 {
    public static void main(String[] args) {
        System.out.println(f());
    }


    static int f() {
        try {
            throw new RuntimeException();
        }finally {
            throw new NullPointerException();
        }
    }

//    static int f() {
//        try {
//            return 12;
//        } finally {
//            return 10;
//        }
//    }

//    static int f() {
//        try {
//            throw new RuntimeException();
//        } finally {
//            return 10;
//        }
//    }
}
