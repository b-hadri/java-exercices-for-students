package hbi.training.exercices.helb1ereJava.td03;

import java.util.Arrays;

public class Temp {

    public static void main(String[] args) {

        int[] t1 = {1, 2, 3};
        int[] t2 = new int[1];

        System.arraycopy(t1, 0, t2, 0, t1.length);

        System.out.println(Arrays.toString(t2));

    }

}
