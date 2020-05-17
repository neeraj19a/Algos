package PartialDone;

import java.util.Arrays;

public class FirstDuplicateCharacter_PD {


        public int returnFirstDuplicateCharacter(String str){

            if(str==null|| str.length()==0){
                return -1;
            }

            int[] charCounts=new int[26];

            for (int i = 0; i <str.length() ; i++) {
                System.out.println(str.charAt(i)-'a');
               charCounts[str.charAt(i)-'a']++;

            }

            System.out.println("Here"+Arrays.toString(charCounts));

            for (int i = 0; i <str.length() ; i++) {
                if(charCounts[str.charAt(i)-'a']>1){ // wherever we find in array if its greater than 1 it should be duplicate
                    return i;
                }

            }

            return -1;

        }
        public static void main(String[] args) {
            FirstDuplicateCharacter_PD firstDuplicateCharacter=new FirstDuplicateCharacter_PD();
            String str="helloo";
            System.out.println(str.charAt(firstDuplicateCharacter.returnFirstDuplicateCharacter(str)));
            String str1="hhhhhelloo";
            System.out.println(str.charAt(firstDuplicateCharacter.returnFirstDuplicateCharacter(str1)));

        }
    }


