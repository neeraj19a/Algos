import java.util.Arrays;

public class QuickSort {

    //Quick Sort is based on Divide and Conquer, we divide Arrays, and point of division is called Pivot
    //Left values should be less than pivot and right values are greater pivot, so trategy is find all sorted pivots and merge them, in the end you will get sorted array
    //complexity O(nlogn)
    //find pivot
    //quick sort left half
    //quick sort right half

    //https://www.youtube.com/watch?v=RNpBjijkjYY&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=23&t=0s
    //Java’s Arrays.sort() method uses Quicksort for sorting arrays of primitives
    // here we are using pivot as middle element, we can choose median of 3 pivot algo as well , its a better approach
        public static void main(String[] args) {
            int[] x = { 9, 2, 4, 7, 3, 7, 10 };
            System.out.println(Arrays.toString(x));

            int low = 0;
            int high = x.length - 1;

            quickSort(x, low, high);
            System.out.println(Arrays.toString(x));
        }

        public static void quickSort(int[] arr, int low, int high) {
            if (arr == null || arr.length == 0)
                return;

            if (low >= high)
                return;

            // pick the pivot
            int middle = low + (high - low) / 2;
            int pivot = arr[middle];

            // make left < pivot and right > pivot
            int i = low, j = high;
            while (i <= j) {
                while (arr[i] < pivot) { // everything is fine so move forward, as left values are less than pivot
                    i++;
                }

                while (arr[j] > pivot) { // everything is fine so move backward, as right values are greater than pivot
                    j--;
                }

                // here no condition means both above conditions fails , something fishy, swap the values now
                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            // recursively sort two sub parts
            if (low < j)
                quickSort(arr, low, j); // as low will be starting point and j was pointer in the end , so we say (low, j)

            if (high > i)
                quickSort(arr, i, high);
        }

    }

