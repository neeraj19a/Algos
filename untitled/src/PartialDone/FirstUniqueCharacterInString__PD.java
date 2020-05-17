package PartialDone;

public class FirstUniqueCharacterInString__PD {

    public int returnFirstUniqueCharacter(String str){

        if(str==null|| str.length()==0){
            return -1;
        }

        int[] charCounts=new int[26];

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i)-'a');
            charCounts[str.charAt(i)-'a']++;

        }

        for (int i = 0; i <str.length() ; i++) {
            if(charCounts[str.charAt(i)-'a']==1){
                return i;
            }

        }

        return -1;

    }
    public static void main(String[] args) {
        FirstUniqueCharacterInString__PD firstUniqueCharacterInString=new FirstUniqueCharacterInString__PD();
        String str="hhelloo";
        System.out.println(str.charAt(firstUniqueCharacterInString.returnFirstUniqueCharacter(str)));
    }
}
