package PartialDone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram__PD {
    public List<List<String>> groupAnagram(String[] str) {
        List<List<String>> groupedAnagrams = new ArrayList<List<String>>();


        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (String current : str) {
            char[] charArray = current.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray); // we will keep sorted as the key "because sorted values will always be same for the group, like "aet" is sorted value for the group aet=[eat, tea, ate] "
            System.out.println("Sorted is -->" + sorted);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<String>());

                System.out.println("Map Here-->" + map);
            }
            map.get(sorted).add(current); // Here by getting the Keys of Map, we are adding in the list a new value i.e current
            System.out.println("Now Map Here-->" + map);
        }
        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }

    public static void main(String[] args) {
        GroupAnagram__PD groupAnagram = new GroupAnagram__PD();
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Here-->" + groupAnagram.groupAnagram(str));
    }
}