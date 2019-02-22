import easy.*;

public class Main {

    public static void main(String[] args) {

        /*
        System.out.println((new leetcode771("aA", "aAABBBB")).result());

        String[] emails = new String[] {"test.email+alex@leetcode.com" , "test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println((new leetcode929(emails)).result());

        System.out.println((new leetcode709("LOVELY")).result());

        String[] words = new String[] {"gin", "zen", "gig", "msg"};
        System.out.println((new leetcode804(words)).result());

        int[] A = new int[] {5,1,5,2,5,3,5,4};
        System.out.println((new leetcode961(A).result()));

        int[] A = new int[]{-4,-1,0,3,10};
        System.out.println((new leetcode977(A).result()));
        */

        int[] A = new int[]{3,1,2,4};
        int[] output = new leetcode905(A).result();
        for (int i = 0; i < output.length; i++)
            System.out.println(output[i]);
    }

}
