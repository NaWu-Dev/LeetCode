package easy;

public class leetcode832 {

    int[][] A;

    int left, right;

    public int[][] result() {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < (A[i].length+1) / 2; j++) {
                left = A[i][j] ^ 1;
                right = A[i][A[i].length-1-j] ^ 1;
                A[i][j] = right;
                A[i][A[i].length-1-j] = left;
            }
        }

        return A;

    }

    public leetcode832(int[][] a) {
        A = a;
    }

    public int[][] getA() {
        return A;
    }

    public void setA(int[][] a) {
        A = a;
    }
}
