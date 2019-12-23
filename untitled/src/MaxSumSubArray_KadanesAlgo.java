public class MaxSumSubArray_KadanesAlgo {

    public static void main(String[] args) {

        int[] a={4,-2,-3,4,-1,-2,1,5,-3};
        int max_ending_here=0; // it will be used to calculate sum of elements in array
        int max_so_far=Integer.MIN_VALUE; // to hold Max Value

        int start=0; // starting index of Array
        int end=0; // ending index of Array

        for (int i = 0; i < a.length; i++) {
            max_ending_here=max_ending_here+a[i]; // adding all next elements
            if(max_so_far<max_ending_here){
                max_so_far=max_ending_here; // if max_so_far is less replaces the value with max_ending_here

                end=i; // we are finding end point of subarray
            }

            if(max_ending_here<0){  // we are using this in case because of negative numbers in array , due to addition of negative numbers if value falls below '0', we initialize value with '0'
                max_ending_here=0;
                //as here the value was less than '0', we have to find a next subarray which has max value so we will scan next elements thinkig next subaaary will have greater sum, so next array starts from 'i+1'
                start=i+1; // we want starting index of next subarray
            }

        }

        System.out.println(max_so_far);
        System.out.println("start-->"+start+"  and end-->"+end);


    }
}
