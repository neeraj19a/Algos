package PartialDone;

public class ReverseOnlyCharacters__PD {
    //https://www.youtube.com/watch?v=qVADz0khbH0
    //Two Pointers approach
    public static void main(String[] args) {

        String s="S;tri*ng to be r!eve.rsed";
        char[] c=s.toCharArray();

        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j&& !(Character.isAlphabetic(s.charAt(i)))){
                i++;

            }
            while(j<i&& !(Character.isAlphabetic(s.charAt(j)))){
                j--;

            }

            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;

            System.out.println(new String(c));
        }
    }
}
