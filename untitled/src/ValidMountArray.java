public class ValidMountArray {

    //https://www.youtube.com/watch?v=WWysBX-N2Ak&feature=emb_logo
    //https://massivealgorithms.blogspot.com/2018/11/leetcode-941-valid-mountain-array.html
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i + 1 < N && A[i] < A[i + 1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N - 1)
            return false;

        // walk down
        while (i + 1 < N && A[i] > A[i + 1])
            i++;

        return i == N - 1;

    }
    public static void main(String[] args) {
        ValidMountArray validMountArray=new ValidMountArray();
        int[] a={4,5,6};
        int[] a1={0,3,2,1};
        int[] a2={2,1};
        int[] a3={3,5,5};


        System.out.println("Here-->"+validMountArray.validMountainArray(a));
        System.out.println("Here-->"+validMountArray.validMountainArray(a1));
        System.out.println("Here-->"+validMountArray.validMountainArray(a2));
        System.out.println("Here-->"+validMountArray.validMountainArray(a3));

    }
}
