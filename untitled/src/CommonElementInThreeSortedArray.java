import java.util.ArrayList;

public class CommonElementInThreeSortedArray {

    //https://www.youtube.com/watch?v=rUPdTNmKa6A&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=31&t=740s

    public ArrayList<Integer> returnCommonElement(int[] a1,int[] a2,int[] a3){
        int x=0;
        int y=0;
        int z=0;
        ArrayList<Integer> commonElements=new ArrayList<>();

        while(x<a1.length&&y<a2.length&&z<a3.length){
            if(a1[x]==a2[y] && a2[y]==a3[z]){
                commonElements.add(a1[x]);
                x++;
                y++;
                z++;

            }
            else if(a1[x]<a2[y]){
                x++;
            }

            else if(a2[y]<a3[z]){
                y++;
            }
            else{
                z++;
            }
        }
        return commonElements;
    }
    public static void main(String[] args) {

        CommonElementInThreeSortedArray commonElementInThreeSortedArray=new CommonElementInThreeSortedArray();
        int[] a1={1,2,3,4,5,6,7,8};
        int[] a2={0,2,4,5};
        int[] a3={0,1,2,3,};

        System.out.println("Here-->"+commonElementInThreeSortedArray.returnCommonElement(a1,a2,a3));
    }
}
