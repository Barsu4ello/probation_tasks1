package core_tasks;

import java.util.Arrays;
import java.util.Random;

public class Test11 {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        int[] arrayCount = new int[100];
        for (int i = 0; i < array.length; i++) {
            arrayCount[array[i]]++;
        }

        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");

        for (int i = 0, y = 0; i < array.length; i++) {
            if(arrayCount[y] != 0){
                array[i] = y;
                arrayCount[y]--;
            }else{
                y++;
                array[i] = y;
                arrayCount[y]--;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
