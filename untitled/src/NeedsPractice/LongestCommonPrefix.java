package NeedsPractice;

public class LongestCommonPrefix {

    //Reference https://www.youtube.com/watch?v=1YQmI7F9dJ0

    public String returnLongestCommonPrefix(String[] str){
        String longestCommonPrefix="";

        if(str==null||str.length==0){
            return  longestCommonPrefix;
        }

        int index=0;
        for(char c:str[0].toCharArray()){ // we are using first string to compare with other strings
            System.out.println("char-->"+c);
            for(int i=1;i<str.length;i++){
                System.out.println("str[i]-->"+str[i]+" and str at index"+str[i].charAt(index));
                if(index>=str[i].length()|| c!=str[i].charAt(index)){ // if we are reaching index greater than string length means we have to stop here and LongestCOmmonPrefic should be till here only
                                            // second condistion is if character are not same no point of adding in common prefix
                    return longestCommonPrefix;
                }
            }
            // now we are out of loop after finding if c is part of str[i] or not, so we will add c in nexr step to longestCommonPrefix
            longestCommonPrefix +=c;
            index++;
        }
        return longestCommonPrefix;
    }
    public static void main(String[] args) {

        LongestCommonPrefix longestCommonPrefix=new LongestCommonPrefix();
        String str[]={"flower","float","flow"};
        System.out.println("longestCommonPrefix-->"+longestCommonPrefix.returnLongestCommonPrefix(str));

        String str1[]={"dog","racecar","car"};
        System.out.println("longestCommonPrefix-->"+longestCommonPrefix.returnLongestCommonPrefix(str1));

    }
}
