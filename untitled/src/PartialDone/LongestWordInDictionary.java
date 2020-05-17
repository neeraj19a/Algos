package PartialDone;

import java.util.Arrays;
import java.util.HashSet;

public class LongestWordInDictionary {

    //LeetCode 720
    //https://www.youtube.com/watch?v=waIgDZZp9Wc&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=25&t=0s
    public String longestWord(String[] words){
        Arrays.sort(words); // as we need lexographically correct, its better to sort array first
        System.out.println("Sorted Words-->"+Arrays.toString(words));
        String result="";
        HashSet<String> builtWords=new HashSet<>();
        for(String w:words){
            if(w.length()==1|| builtWords.contains(w.substring(0,w.length()-1))){ // here we have two conditions one is if we have only one character i.e w.length()==1 , in that case we add 'w' to our result and then return result
                //Sorted Words-->[a, ap, app, appl, apple, apply, banana]
                //otherwise, we have to scan character by character to check if we have seen similar characters before as well
                //for example this condition--> builtWords.contains(w.substring(0,w.length()-1)), here 'w.substring' is current word example: 'ap'
                //Now builtWords.contains(w.substring(0,w.length()-1)), will give 'a' which is present in array previous to 'ap'  (See sorted Array above)
                // So in this way we will do linear scanning word by word till we find longest
                if(w.length()>result.length()) { // as we need largest in result, we are checking if current word is largest
                    result = w;
                    builtWords.add(w);
                }
            }
        }

        return result; // we want ro return empty string if we don't find, that why we initalize   String result=""; above
    }

    public static void main(String[] args) {
        //Here array is not sorted and banana is present which different from other words like a , appl
        //Note apply and apple both can be answer, but as we are asking lexographically in that case 'apple' comes first than 'apply'
        String[] words={"a","banana","app","appl","ap","apply","apple"};


        LongestWordInDictionary longestWordInDictionary=new LongestWordInDictionary();
        System.out.println("Longest Word-->"+longestWordInDictionary.longestWord(words));
    }
}
