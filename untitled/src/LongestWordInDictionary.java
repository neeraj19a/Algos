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
            if(w.length()==1|| builtWords.contains(w.substring(0,w.length()-1))){ //
                if(w.length()>result.length()) { // as we need largest in result, we are checking if current word is largest
                    result = w;
                    builtWords.add(w);
                }
            }
        }

        return result; // we want ro return empty string if we don't find, that why we initalize   String result=""; above
    }

    public static void main(String[] args) {
        String[] words={"a","banana","app","appl","ap","apply","apple"};

        LongestWordInDictionary longestWordInDictionary=new LongestWordInDictionary();
        System.out.println("Longest Word-->"+longestWordInDictionary.longestWord(words));
    }
}
