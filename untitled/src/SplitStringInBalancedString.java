public class SplitStringInBalancedString {

    //https://www.youtube.com/watch?v=rnwmE9m9EMM&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=108&t=0s
    //https://leetcode.com/problems/split-a-string-in-balanced-strings/

    /*Input: s = "RLRRLLRLRL"
    Output: 4
    Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.*/

    public int balancedStringSplit(String s) {
        int balancedCount = 0;
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'L') {
                count++;
            } else if (chars[i] == 'R') {
                count--;
            }

            //Now if we have passed if and else if block means we have found a pair of characters L and R
            //in that case count will be 0 as we have qual L and equal R, so we will increment 'balancedCount++'
            if (count == 0) {
                balancedCount++;
            }
        }
        return balancedCount;
    }

    public static void main(String[] args) {
        SplitStringInBalancedString splitStringInBalancedString=new SplitStringInBalancedString();

        System.out.println("Here-->"+splitStringInBalancedString.balancedStringSplit("RLRRLLRLRL"));
        System.out.println("Here-->"+splitStringInBalancedString.balancedStringSplit("RLLLLRRRLR"));
        System.out.println("Here-->"+splitStringInBalancedString.balancedStringSplit("LLLLRRRR"));
        System.out.println("Here-->"+splitStringInBalancedString.balancedStringSplit("RLRRRLLRLL"));

    }
}
