package core_tasks;

public class Test18 {

    public static void main(String[] args) throws Exception {
        Bear bear = new Bear();
        System.out.println(bear);
    }
}

class Bear {
    @Override
    public String toString() {
        return "BearAddress: " + this;
    }
}


