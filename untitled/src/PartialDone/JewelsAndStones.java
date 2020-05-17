package PartialDone;

import java.util.HashSet;

public class JewelsAndStones {

    //https://www.youtube.com/watch?v=9Reqqk60Nv4&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=36&t=0s
    public int returnJewelsAndStones(String jewels,String stones){

        char[] jewels_char=jewels.toCharArray();
        char[] stones_char=stones.toCharArray();

        HashSet<Character> jewels_set=new HashSet<>();
        for(char c:jewels_char){
            jewels_set.add(c);
        }

        int num_Jewels=0;
        for(char c:stones_char){
            if(jewels_set.contains(c)){
                num_Jewels++;
            }
        }

        return num_Jewels;
    }
    public static void main(String[] args) {

        JewelsAndStones jewelsAndStones=new JewelsAndStones();
        System.out.println("Here-->"+jewelsAndStones.returnJewelsAndStones("aA","aAAbbbb"));
    }
}
