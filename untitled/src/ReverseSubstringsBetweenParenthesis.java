import java.util.Stack;

//https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/discuss/398082/Simple-Java-Version-with-Stack
public class ReverseSubstringsBetweenParenthesis {

    public String reverseParentheses(String s) {
        if(s.length()<=1) return s;
        char[] str = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<str.length;i++) {
            char c = str[i];
            if(c=='(') {
                stack.push(i);              //save the index of '('
            }else if(c==')'){
                int start = stack.pop();    //get the index of '('
                reverse(str, start+1, i-1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:str){
            if(c!='(' && c!=')') sb.append(c);
        }
        return sb.toString();
    }

    private void reverse(char[] chars, int start, int end) {
        while(start<end && chars[start]=='(') start++;    //skip open '('   handle cases like  consective '(' like ((
        while(start<end){
            char temp = chars[start];
            chars[start]= chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ReverseSubstringsBetweenParenthesis reverseSubstringsBetweenParenthesis = new ReverseSubstringsBetweenParenthesis();

        System.out.println("Here-->" + reverseSubstringsBetweenParenthesis.reverseParentheses("(abcd)"));
        System.out.println("Here-->" + reverseSubstringsBetweenParenthesis.reverseParentheses("(u(love)i)"));
        System.out.println("Here-->" + reverseSubstringsBetweenParenthesis.reverseParentheses("(ed(et(oc))el)"));
        System.out.println("Here-->" + reverseSubstringsBetweenParenthesis.reverseParentheses("a(bcdefghijkl(mno)p)q"));



    }
}
