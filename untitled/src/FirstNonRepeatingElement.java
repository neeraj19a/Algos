import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

    public Character returnFirstNonRepeated(String str){

        char nonrepeated=0;
        char[] chars=str.toCharArray();

        for (char check:chars) {
            if(str.indexOf(check)==str.lastIndexOf(check)){ // here if characters in non repeated or its unique then its first and last index of that character should be same
                nonrepeated=check;
                break;
            }
        }
        return  nonrepeated;

    }

    //Here LinkedHashMap is preferred over HashMap as LinkedhashMap maintains insertion order which helps to determine the first non-repeated character.
    public Character returnFirstNonRepeatedUsingLinkedHashMap(String str){
        char[] chars=str.toCharArray();

        char nonrepeated=0;
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character, Integer>();

        for(char check:chars){
            if(map.containsKey(check)){
                map.put(check,map.get(check)+1);
            }
            else {
                map.put(check,1);
            }
        }

        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                nonrepeated=entry.getKey();
                break;
            }
        }
        return nonrepeated;
    }
    public static void main(String[] args) {

        FirstNonRepeatingElement firstNonRepeatingElement=new FirstNonRepeatingElement();
        String str = "neeraj";
        System.out.println("Non repeated Using Index-->"+firstNonRepeatingElement.returnFirstNonRepeated(str));
        System.out.println("Non repeated Using LinedHasMap-->"+firstNonRepeatingElement.returnFirstNonRepeatedUsingLinkedHashMap(str));


        str = "amazon";
        System.out.println("Non repeated-->"+firstNonRepeatingElement.returnFirstNonRepeated(str));
        System.out.println("Non repeated Using LinedHasMap-->"+firstNonRepeatingElement.returnFirstNonRepeatedUsingLinkedHashMap(str));

        str = "dopqwerrewqtopd";
        System.out.println("Non repeated-->"+firstNonRepeatingElement.returnFirstNonRepeated(str));
        System.out.println("Non repeated Using LinedHasMap-->"+firstNonRepeatingElement.returnFirstNonRepeatedUsingLinkedHashMap(str));

        str = "hahahahahahaha"; // every character is repeated
        System.out.println("Non repeated-->"+firstNonRepeatingElement.returnFirstNonRepeated(str));
        System.out.println("Non repeated Using LinedHasMap-->"+firstNonRepeatingElement.returnFirstNonRepeatedUsingLinkedHashMap(str));


    }
}
