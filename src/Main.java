import easy.leetcode771;
import easy.leetcode929;

public class Main {

    public static void main(String[] args) {

        System.out.println((new leetcode771("aA", "aAABBBB")).result());

        String[] emails = new String[] {"test.email+alex@leetcode.com" , "test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println((new leetcode929(emails)).result());

    }

}
