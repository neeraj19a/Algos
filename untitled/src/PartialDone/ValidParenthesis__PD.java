package PartialDone;

import java.util.Stack;

public class ValidParenthesis__PD {

    //https://www.youtube.com/watch?v=f8Jq8Ibg2Ys&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=19&t=51s
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();

        for (char check : c) {
            if (check == '(' || check == '{' || check == '[') {
                stack.push(check);
            }
            else if(check==')'&& !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else if(check=='}'&& !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
            else if(check==']'&& !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }



        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        ValidParenthesis__PD validParenthesis = new ValidParenthesis__PD();
        String s="{#$%^&*{})[]";
        String s1="{#$%^&*{}})([]";
        String s2="{abc{})[]";
        String s3="(ab){cd}[ef])(}{[]";
        String s4="(ab){cd}[ef]";



        System.out.println(validParenthesis.isValid(s));
        System.out.println(validParenthesis.isValid(s1));
        System.out.println(validParenthesis.isValid(s2));
        System.out.println(validParenthesis.isValid(s3));
        System.out.println(validParenthesis.isValid(s4));


    }
}
