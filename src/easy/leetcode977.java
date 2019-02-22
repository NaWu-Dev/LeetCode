package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode977 {

    int[] A;

    public int[] result() {

        int[] output = new int[A.length];
        int temp;

        for (int i = 0; i < A.length; i++) {
            temp = (int) Math.pow(A[i], 2);
            output[i] = temp;
        }

        Arrays.parallelSort(output);

        return output;

    }

    public leetcode977(int[] a) {
        A = a;
    }

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }
}
