public class DutchNationalFlagAlgorithm {


    /*1) Create a low pointer at the beginning of the array and a high pointer at the end of the array.
     (2) Create a mid pointer that starts at the beginning of the array and iterates through each element.
     (3) If the element at arr[mid] is a 2, then swap arr[mid] and arr[high] and decrease the high pointer by 1.
     (4) If the element at arr[mid] is a 0, then swap arr[mid] and arr[low] and increase the low and mid pointers by 1.
     (5) If the element at arr[mid] is a 1, don't swap anything and just increase the mid pointer by 1.
    */
    //we don't touch 1 so in the end every 1 will be in middle

    public void threewaypartition(int [] a){
        int low = 0;
        int mid = 0;
        int high = a.length - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    //swap(a,a[low], a[mid]);

                    int temp =  a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    //swap(a,a[mid],a[high]);
                    temp =  a[mid];
                    a[mid] = a[high];
                    a[high] = temp;

                    high--;
                    break;
            }
        }
    }
    public static void main(String[] args) {

        int[] a = {0, 1, 2, 0, 1, 1, 1, 0, 2, 0, 1};

        DutchNationalFlagAlgorithm dutchNationalFlagAlgorithm=new DutchNationalFlagAlgorithm();
        dutchNationalFlagAlgorithm.threewaypartition(a);


        for (int i = 0; i < a.length ;i++) {
            System.out.print(a[i]);
        }
    }
}
