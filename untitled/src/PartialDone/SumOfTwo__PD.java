package PartialDone;

import java.util.HashSet;

//https://www.youtube.com/watch?v=sfuZzBLPcx4
public class SumOfTwo__PD {
    public static void main(String[] args) {
        int a[]={1,5,8,2,10,-8,-3,9};
        int b[]={40,21,7,23,-7};
        int v=26;
        boolean flag=false;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i <a.length ; i++) {
            int difference=v-a[i];
            set.add(difference);
        }

        for (int i = 0; i <b.length ; i++) {
            if(set.contains(b[i])){
                System.out.println("index-->"+i);

                flag =true;
            }
        }

        System.out.println(flag);
    }
}
