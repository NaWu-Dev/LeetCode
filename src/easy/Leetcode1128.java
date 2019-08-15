import java.util.HashMap;

public class Leetcode1128 {

    public int numEquivDominoPairs(int[][] dominoes) {

        if (dominoes.length == 1) return 0;

        HashMap<String, Integer> hashMap = new HashMap<>();

        int result = 0;

        for (int[] temp : dominoes) {
            String key = temp[0] < temp[1] ? ""+temp[0]+temp[1] : ""+temp[1]+temp[0];
            int count = hashMap.getOrDefault(key, 0);
            result += count;
            hashMap.put(key, count+1);
        }

        return result;

    }



}
