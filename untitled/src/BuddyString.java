
public class BuddyString {

    //http://buttercola.blogspot.com/2019/03/leetcode-859-buddy-strings.html
    public boolean buddyStrings(String A, String B) {
        if (A==null||B==null||A.length() != B.length() || A.length() < 2 || B.length() < 2) {
            return false;
        }

        // case 1: if A == B, we only need to replace the same characters
        //
        if (A.equals(B)) {
            int[] counts = new int[26];
            for (char c : A.toCharArray()) {
                counts[c - 'a']++;
                if (counts[c - 'a'] > 1) {
                    return true;
                }
            }

            return false;
        }

        // case 2: otherwise, we only swap once
        //
        int first = 0;
        int second = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (first == 0) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        System.out.println(A);
        System.out.println(B);

        return A.charAt(first) == B.charAt(second) && A.charAt(second) == B.charAt(first);
    }
    public static void main(String[] args) {
        BuddyString buddyString=new BuddyString();
        String s1="ab";
        String s2="ba";

        String s3=null;
        String s4=null;

        String s5="aaaaaaabc";
        String s6="aaaaaaacb";

        String s7="ab";
        String s8="ab";

        String s9="aa";
        String s10="aa";

        System.out.println(buddyString.buddyStrings(s1,s2));
        System.out.println(buddyString.buddyStrings(s3,s4));
        System.out.println(buddyString.buddyStrings(s5,s6));
        System.out.println(buddyString.buddyStrings(s7,s8));
        System.out.println(buddyString.buddyStrings(s9,s10));

    }
}
