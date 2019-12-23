import java.util.HashSet;
import java.util.Set;

public class LongestStringWithoutRepeatingCharacters_Sliding_Window_Technique {


    //source: https://www.youtube.com/watch?v=8ZlmgBcQzMM
    public int returnLongestString(String str) {

        if (str == null || str.length() == 0) {
            return 0;
        }
        char[] c = str.toCharArray();
        Set<Character> set = new HashSet<Character>();

        int i = 0, j = 0; // take two pointers, j will keep on moving towards right for getting next character and add in set, here we will check if set already contains that character, if it exists go to else block
        while (i < c.length && j < c.length) {

            if (!set.contains(c[j])) {
                set.add(c[j]);
                j++;
            } else {
                // here in else block we have i pointer which we will move only 'if' if block is executed means if duplicacy is there we need to remove element from set from the begining as need to allow j pinter to move further and scan next elements
                set.remove(c[i]); // we remove the duplicate element that came and we increase the pointer
                i++; // i++ will move now abac
                // i,j  // i is at a and j is at b
                //  i,j, here i moved to b as we removed the element a as you see a is next to b

                //Sliding Window Technique, as we are increasing the j pointer and eleminating the i characters from begining we can see we are sliding from left to right
            }

        }
        System.out.println("start-->" + i);
        System.out.println("end-->" + j);
        String required = str.substring(i, j);
        System.out.println("required-->" + required);
        return set.size();

    }

    public static void main(String[] args) {
        LongestStringWithoutRepeatingCharacters_Sliding_Window_Technique longestStringWithoutRepeatingCharacters = new LongestStringWithoutRepeatingCharacters_Sliding_Window_Technique();

        System.out.println(longestStringWithoutRepeatingCharacters.returnLongestString("madamb"));

        System.out.println(longestStringWithoutRepeatingCharacters.returnLongestString("cool"));

        System.out.println(longestStringWithoutRepeatingCharacters.returnLongestString(null));



    }
}
