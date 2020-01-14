import java.util.HashMap;

public class SubArraySumEqualsK { //https://www.youtube.com/watch?v=AmlVSNBHzJg&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=39&t=0s
    public int returnSubArrayEqualsK(int[] nums, int k) {
        HashMap<Integer, Integer> arr_sums = new HashMap<Integer, Integer>();
        // In This HashMap here first is cumulative sum of elements and next int is number of times we have seen them
        arr_sums.put(0, 1);
        int sum = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            arr_sums.put(sum, arr_sums.getOrDefault(sum, 0) + 1);
            if (arr_sums.containsKey(sum - k)) {
                result += arr_sums.get(sum - k);
            }
        }
        System.out.println("Here-->" + arr_sums);
        return result;
    }

    public static void main(String[] args) {
        SubArraySumEqualsK subArraySumEqualsK = new SubArraySumEqualsK();
        int[] a = {1, 2, 1, 3};
        int k = 4;
        System.out.println("Result -->" + subArraySumEqualsK.returnSubArrayEqualsK(a, k));
    }
}
