import java.util.Stack;

public class StringwithBackSpaceCharacters {
    //Given Two Strings ab#c and ad#c , here # represents backspace, so output will be ac and ac, we have to check if two strings are equal
    public boolean returnStringWithBackspaceAreEqual(String string, String T) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = string.toCharArray();
        for (char c : chars) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        Stack<Character> stack1 = new Stack<Character>();
        char[] chars1 = T.toCharArray();
        for (char c : chars1) {
            if (c != '#') {
                stack1.push(c);
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }
        return (stack.equals(stack1));
    }

    public static void main(String[] args) {
        StringwithBackSpaceCharacters stringwithBackSpaceCharacters = new StringwithBackSpaceCharacters();
        System.out.println(stringwithBackSpaceCharacters.returnStringWithBackspaceAreEqual("ab#c", "ad1#c"));
        System.out.println(stringwithBackSpaceCharacters.returnStringWithBackspaceAreEqual("ab#c", "ad1#c"));
        System.out.println(stringwithBackSpaceCharacters.returnStringWithBackspaceAreEqual("ab#c", "ad#c"));
    }
}
