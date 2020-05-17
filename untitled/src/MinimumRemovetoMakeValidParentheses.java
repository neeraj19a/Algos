
//https://www.youtube.com/watch?v=thL70BR3yMA&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=112&t=380s
public class MinimumRemovetoMakeValidParentheses {

    public String removeExtraParethesis(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0; // we will use this to track and balance this variable by open++ and open--, to check with if there is equal braces or not
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                open++;
            } else if (chars[i] == ')') {
                //Now we will see if we have extra brace
                if (open == 0)
                    continue; // this will go to for loop and won't go to next line
                //if the above condition fails, means if we don't have extra brace, go to next line and do open--, to balance the parenthesis
                open--;
            }

            sb.append(chars[i]); // we will append only the characters we want
        }

        //Now we will also solve the case , if we have extra open space means open>1 it means we have extra open space , so we will scan the String backward and remove extra open
        StringBuilder result = new StringBuilder();
        //backward loop, because if we go forward loop we would end up deleting balance parenthesis
        //Example: ()(, in this case if we loop backward we will delete last parenthesis, but if we loop forward , we will end up deleeting first bracket, which is wrong
        for (int i = sb.length()-1; i >= 0; i--) {
            //here we check if we have open brace and we also do open-- to check if still open is greater than 0 , means do we still have 1 open brace..? if yes continue the loop, but if its not we will append that character in result
            if (sb.charAt(i) == '(' && open-- > 0)
                continue;
            result.append(sb.charAt(i));
        }

        return result.reverse().toString(); // as we did reverse loop, for result we will again reverse for result
    }

    public static void main(String[] args) {
        MinimumRemovetoMakeValidParentheses minimumRemovetoMakeValidParentheses=new MinimumRemovetoMakeValidParentheses();
        System.out.println("Here-->"+minimumRemovetoMakeValidParentheses.removeExtraParethesis("lee(t(c)o)de)"));

        System.out.println("Here-->"+minimumRemovetoMakeValidParentheses.removeExtraParethesis("a)b(c)d"));

        System.out.println("Here-->"+minimumRemovetoMakeValidParentheses.removeExtraParethesis("(a(b(c)d)"));


    }
}
