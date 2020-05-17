import java.util.Arrays;

public class WordThatCanBeFormedByCharacters {

    //https://www.youtube.com/watch?v=M2HFao-zgk8&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=104&t=379s
    //https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/

    /*
    Input: words = ["cat","bt","hat","tree"], chars = "atach"
    Output: 6
    Explanation:
    The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
    */
    public int countCharacters(String[] words,String chars){

        int goodWords_length_sum=0;

        int[] chars_count=new int[26];

        for(char c:chars.toCharArray()){
            chars_count[c-'a']++; // finding all characters we need to match with String array
        }

        for(String word:words){
            int[] temp_chars_count= Arrays.copyOf(chars_count,chars_count.length);
            int valid_char_count=0;
            for(char c:word.toCharArray()){
                if(temp_chars_count[c-'a']>0) { // now we check if we after subtracting that value from word is greater than zero it ,means that character is present, we will increment valid_char_count
                    valid_char_count++;
                    temp_chars_count[c - 'a']--; // no we do '--' because we don't want to visit this character again as we have already evaluated this character in above logic "temp_chars_count[c-'a']>0"
                }
            }
            if(valid_char_count==word.length()){ // here if valid_char_count == lenght of any word like 'cat' , so we say yes and calculate length of that word i.e. 3 i.e. length of cat
                goodWords_length_sum +=word.length(); // we do this because we want to add length of all word that matches and store in 'goodWords_length_sum'
            }

        }

        return goodWords_length_sum;
    }
    public static void main(String[] args) {

        WordThatCanBeFormedByCharacters wordThatCanBeFormedByCharacters=new WordThatCanBeFormedByCharacters();
        String[] words = {"cat","bt","hat","tree"   };
        String c= "atach";

/*
        String[] words = {"hello","world","leetcode"};
        String c= "welldonehoneyr";
*/

        System.out.println("Here-->"+wordThatCanBeFormedByCharacters.countCharacters(words,c));
    }
}
