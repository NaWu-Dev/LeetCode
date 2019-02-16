package easy;

import java.util.HashMap;
import java.util.HashSet;

public class leetcode929 {

    String[] emails;

    public int result() {

        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            /*
            String localName, emailAddress;

            localName = email.substring(0, email.indexOf('@'));
            emailAddress = email.substring(email.indexOf('@'));

            localName = localName.replace(".", "");
            if (localName.indexOf('+') >= 0)
                localName = localName.substring(0, localName.indexOf('+'));

            email = localName + emailAddress;

            if (!set.contains(email))
                set.add(email);
                */

            // Better solution
            String[] parts = email.split("@");
            String[] localName = parts[0].split("\\+");
            set.add(localName[0].replace(".", "") + "@" + parts[1]);

        }
        return set.size();
    }

    public leetcode929(String[] emails) {
        this.emails = emails;
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }
}
