public class NameLongPressed {

    //https://www.youtube.com/watch?v=IQLAtVE19RQ&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=35&t=0s
    public boolean isLongPressed(String name, String typed) {

        //two pointer
        int i = 0; // for String name
        int j = 0;// for String typed
        if (name.length() > typed.length()) {
            return false;
        }

        if (name.length() == typed.length()) {
            return true;
        } else {
            while (j < typed.length()) {
                if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                    i++;
                } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {//j==0 it means starting char of type is different, simply its not long press, otherwise if current and previous character of typed doesn't match, its not a long press

                    return false;
                }
                j++;
            }
        }

        return i == name.length(); // check if we parsed the whole string , in that case i will reach the length
    }

    public static void main(String[] args) {

        NameLongPressed nameLongPressed = new NameLongPressed();

        System.out.println("Here-->" + nameLongPressed.isLongPressed("abc", "aabbc"));
        System.out.println("Here-->" + nameLongPressed.isLongPressed("abc", "aabbc"));
        System.out.println("Here-->" + nameLongPressed.isLongPressed("leelee", "lleeelee"));
        System.out.println("Here-->" + nameLongPressed.isLongPressed("saeed", "ssaaedd"));


    }

    //abc
    //aabc
}
