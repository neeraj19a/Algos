public class ConvertUpperCaseToLowerCase {

    public static void main(String[] args) {

        String str = "ABCD";
        char[] c = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < c.length - 1; i++) {
            int value = Integer.valueOf(c[i]);
            if (value > 64 && value < 91) {
                value = value + 32;
                stringBuilder.append((char) value);
            }
        }

        System.out.println(stringBuilder);
    }
}
