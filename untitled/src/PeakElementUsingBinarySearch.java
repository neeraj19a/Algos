public class PeakElementUsingBinarySearch {

    //https://www.youtube.com/watch?v=2Y_0_IyZtHM
    public int returnPeakElement(int a[]){

        int start=0;
        int end=a.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if((mid==0 || a[mid]>= a[mid-1]) //to check if we are not going out of bound index in array on LHS
                    && (mid==a.length-2 || (a[mid+1] <=a[mid]))){ //to check if we are not going out of bound index in array on RHS

                return  a[mid];
            }
            else if(mid > 0 &&a[mid-1]>a[mid]){
                end=mid-1;

            }
            else{
                start=mid+1;


            }
        }

        return -1;
    }

    public static int findUsingBinarySearch(int[] arr) {

        int n = arr.length;

        int start = 0;
        int end = n - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if ((mid == 0 || arr[mid - 1] <= arr[mid])
                    && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                return arr[mid];

            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        PeakElementUsingBinarySearch peakElementUsingBinarySearch=new PeakElementUsingBinarySearch();

        int[] a={2,3,4,7,5};

        System.out.println(peakElementUsingBinarySearch.returnPeakElement(a));

        int result = findUsingBinarySearch(a);
        System.out.println(result);
    }
}
