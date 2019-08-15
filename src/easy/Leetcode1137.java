import java.util.Date;

public class Leetcode1137 {

    public int tribonacci(int n) {

        if (n < 3) return n==0? 0: 1;

        int x0 = 0, x1 = 1, x2 = 1;
        int xResult = 0;

        for (int i = 3; i <= n; i++) {
            xResult = x0 + x1 + x2;
            x0 = x1;
            x1 = x2;
            x2 = xResult;

        }

        return xResult;

    }

}
