package core_tasks;

import org.springframework.beans.CachedIntrospectionResults;

public class Test22 {
    public static void main(String[] args) {
        Integer[] integers1 = new Integer[]{1, 2, 3};
//        int[] integers2 = integers1;
//        int[] integers2 = (int[]) integers1;
    }
}































class Convert {
    static int[] convert(Integer[] a){
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        return result;
    }
}



