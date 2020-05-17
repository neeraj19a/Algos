import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {

    //https://leetcode.com/problems/find-all-anagrams-in-a-string/
    //https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/636898/Simple-Java-Solution
    public List findAnagrams(String s, String p) {
        int k = p.length();
        int n = s.length();
        List list = new ArrayList(); // the result of the starting indices is stored in this list

        int[] arr = new int[26];
        for (int i = 0; i < k; i++) {
            arr[p.charAt(i) - 'a']++;
            // storing the count of the string's characters whose anagrams are to be printed
        }
        for (int i = 0; i <= n - k; i++) {
            String t = s.substring(i, k + i);
            int[] c = new int[26];

            for (int j = 0; j < k; j++) {
                c[t.charAt(j) - 'a']++; // taking a window of size of string's length to get the frequency of each character present
            }
            if (Arrays.equals(arr, c))
                list.add(i); //checking if both count arrays are equal or not
        }
        return list;
    }

    public static void main(String[] args) {
        FindAllAnagramsInString findAllAnagramsInString=new FindAllAnagramsInString();

        System.out.println("Here-->"+findAllAnagramsInString.findAnagrams("cbaebabacd","abc"));
        System.out.println("Here-->"+findAllAnagramsInString.findAnagrams("abab","ab"));

    }
}
