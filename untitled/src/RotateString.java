public class RotateString {

    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length())
            return false;

        if(A.equals(B))
            return true;

        for(int i=0;i<A.length();i++){
            char ch = A.charAt(0);
            A = new StringBuilder(A).deleteCharAt(0).toString();
            A += ch;
            if(A.equals(B))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        RotateString rotateString=new RotateString();
        String A = "abcde";
        String B = "cdeab";

        System.out.println("Here-->"+rotateString.rotateString(A,B));
    }
}
