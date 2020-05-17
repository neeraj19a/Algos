package PartialDone;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] a={1,5,6,7};
        int[] b={2,5,8,9,11};

        int i=0;
        int j=0;

        int c[]=new int[a.length+b.length];
        int k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]) {
                c[k] =a[i];
                k++;
                i++;
            }
            else {
                c[k]=b[j];
                k++;
                j++;

            }

        }

        while(i<a.length){
            c[k]=a[i];
            k++;
            i++;
        }

        while(j<b.length){
            c[k]=b[j];
            k++;
            j++;
        }

        for (int l = 0; l < c.length; l++) {
            System.out.println(c[l]);
        }
    }


}
