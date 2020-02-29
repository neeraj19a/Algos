import java.util.Arrays;

/*
We start from the left and keep two index one for even position and other for odd positions. Traverse these index from left.
At even position there should be even number and at odd positions, there should be odd number .
Whenever there is mismatch , we swap the values at odd and even index.
 */
public class ArrangeEvenNumberAtEvenLocationandOddNumbersAtOddLocation {
    private int [] array={2, 5, 8, 6, 11, 23, 18, 1, 9, 10};;
    private int len=array.length;
    public static void main(String [] args)
    {
        ArrangeEvenNumberAtEvenLocationandOddNumbersAtOddLocation a=new ArrangeEvenNumberAtEvenLocationandOddNumbersAtOddLocation();
        a.print();
        a.arrange();
        a.print();

    }
    public  void print()
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }
    public void arrange()
    {
        int oddinx=1;
        int evenidx=0;
        while(true)
        {
            while(evenidx<len && array[evenidx]%2==0)
            {
                evenidx+=2;
            }
            while(oddinx<len && array[oddinx]%2==1)
            {
                oddinx+=2;
            }
            if (evenidx < len && oddinx < len)
                swap (evenidx, oddinx);
            else
                break;

        }

    }
    public void swap(int a,int b)
    {
        int tmp=array[b];
        array[b]=array[a];
        array[a]=tmp;
    }
}
