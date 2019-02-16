package easy;

import java.util.HashMap;

public class leetcode961 {

    int[] A;

    public int result() {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int temp : A) {
            if (map.containsKey(temp)) {
                return temp;
            } else {
                map.put(temp, 1);
            }
        }

        return -1;

    }

    public leetcode961(int[] a) {
        A = a;
    }

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }
}
