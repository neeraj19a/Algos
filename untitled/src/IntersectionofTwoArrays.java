public class IntersectionofTwoArrays {

    public static void main(String[] args) {

        int arr1[] = {2, 3, 6, 7, 9, 11};
        int arr2[] = {4, 6, 8, 9, 12};

        int i=0;
        int j=0;

        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }

            else if (arr1[i]>arr2[j]){
                j++;
            }


            else {
                i++;
            }
        }
    }
}
