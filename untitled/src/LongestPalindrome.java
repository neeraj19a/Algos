public class LongestPalindrome {


    public int longestPalindrome(String string){
        int[] char_counts=new int[128];
        char[] c=string.toCharArray();

        for(char chars:c){
            char_counts[chars]++;
        }

        int result=0;
        for(Integer char_count: char_counts){
            System.out.println("char_count-->"+char_count);
            System.out.println("Division-->"+char_count/2*2);
            result+=char_count/2*2;
            System.out.println("result-->"+result);

            if(result%2==0&& char_count%2==1){
                result+=1;
            }
        }

        return  result;
    }
    public static void main(String[] args) {

        LongestPalindrome longestPalindrome=new LongestPalindrome();

       /* System.out.println("Here -->"+longestPalindrome.longestPalindrome("abccccdd"));

        System.out.println("Here -->"+longestPalindrome.longestPalindrome("abcd"));*/


        System.out.println("Here -->"+longestPalindrome.longestPalindrome("need"));

    }
}
