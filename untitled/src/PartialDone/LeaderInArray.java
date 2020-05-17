package PartialDone;

public class LeaderInArray {


    public void printLeader(int[] arr) {

        int mfr = arr[arr.length - 1]; // mfr--> maximum from right method , here we will scan array from right to left ,so we are assuming last element is leader

        for (int i = arr.length - 2; i >= 0; i--) { // we will compare from previous element of last element(n-1) i.e. n-2  , till first element
            if (arr[i] > mfr) { // if any element is greater than MFR means it is leader

                mfr = arr[i];
            }
        }
        System.out.println("Leader is-->" + mfr);
    }

    public static void main(String[] args) {
        LeaderInArray leaderInArray=new LeaderInArray();

        int[] arr = {15, 16, 3, 2, 1, 6, 4};

        int[] arr1 = {15, 16, 18, 2, 1, 20, 4};


        int[] arr2 = {15, 20, 18, 2, 1, 19, 19}; // last number as duplicates

        int[] arr3 = {25, 16, 18, 2, 1, 20, 20}; // first element is biggest with duplicates in last


        int[] arr4 = {25, 16, 18, 2, 1, 20, 30}; // last element is biggest

        leaderInArray.printLeader(arr);
        leaderInArray.printLeader(arr1);

        leaderInArray.printLeader(arr2);
        leaderInArray.printLeader(arr3);
        leaderInArray.printLeader(arr4);

    }
}
