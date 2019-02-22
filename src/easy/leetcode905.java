package easy;

import java.util.HashSet;

public class leetcode905 {

    int[] A;

    public int[] result() {

        int[] output = new int[A.length];
        int head = 0, tail = A.length-1;

        for (int i = 0; i < A.length; i++) {

            if (A[i]%2 == 0) {
                output[head] = A[i];
                head++;
            }
            else {
                output[tail] = A[i];
                tail--;
            }

        }

        return output;

    }

    public leetcode905(int[] a) {
        A = a;
    }

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }
}
