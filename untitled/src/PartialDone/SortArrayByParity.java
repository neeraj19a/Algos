package PartialDone;

import java.util.Arrays;//https://www.youtube.com/watch?v=KMaQjKaeBIE&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=32&t=0s

//Input Array-->  int[] array2={8,7,6,11,22,132,2,134,1,3};
//Output Array--> Here-->[8, 6, 22, 132, 2, 134, 7, 11, 1, 3]
public class SortArrayByParity {
    public String sortArrayByParity(int[] array) {

        int index = 0;// we will use index to track and save element on that array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {// we identify even elements and keep them on left side
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
                index++;
            }
        }
        return Arrays.toString(array);
    }



    public static void main(String[] args) {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] array = {6, 2, 4, 1, 3};
        int[] array1 = {8, 7, 6, 2, 4, 1, 3};
        int[] array2 = {8, 7, 6, 11, 22, 132, 2, 134, 1, 3};
        int[] array3 = {10, 1, 18, 7, 6, 2, 4, 1, 3};
        System.out.println("Here-->" + sortArrayByParity.sortArrayByParity((array)));
        System.out.println("Here-->" + sortArrayByParity.sortArrayByParity((array1)));
        System.out.println("Here-->" + sortArrayByParity.sortArrayByParity((array2)));
        System.out.println("Here-->" + sortArrayByParity.sortArrayByParity((array3)));
    }
}