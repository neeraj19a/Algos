import java.util.Arrays;

public class FindTripletSumInArray {

    public boolean isTripletPresent(int a[],int sum){

        Arrays.sort(a);


        boolean flag=false;
        for (int i = 0; i < a.length; i++) {
            int start=i+1; // we start from second element , as we assume here first element will be picked from i pointer i.e. at 0 and we will keep moving start pointer forward
            int end=a.length-1; // we keep end as last element as we will scan from start till end

            while(start<end){
                if((a[i]+a[start]+a[end])==sum){ // check sum of a[i] i.e first element at '0' position , a[start], that is second position and end element
                    flag=true;
                    System.out.println("first-->"+a[i]+" second-->"+a[start]+" third-->"+a[end]);
                    break;
                }
                else if((a[i]+a[start]+a[end])<sum){ // if sum is not equal in above condition , we reach here and check if sum is greater , so we move start pointer to nect element as we are in sorted array we can expect a bigger element in next move
                    start++;
                }
                else
                { // else if sum is greater than we want to find smaller element by which sum should be less , so as this is sorted array we come back using end--
                    end--;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        FindTripletSumInArray findTripletSumInArray=new FindTripletSumInArray();

        int[] a={1,4,45,6,10,8};
        System.out.println(findTripletSumInArray.isTripletPresent(a,50));
    }
}
