package PartialDone;

public class BuyandSellMaxProfit {

    public int maxProfit(int [] prices){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min){
                min=prices[i]; // first we find minimum, because that will be Purchase Day, to get max profit

            }
            else {
                max=Math.max(max,prices[i]-min); // now we subtract prices[i] i.e. Price of Upcoming days with 'min' i.e. Buy Day
                System.out.println("First number is-->"+prices[i]+" and other number is-->"+min);
            }
        }

        return max;
    }


    public static void main(String[] args) {
        int[] i={7,1,5,3,6,4};

        BuyandSellMaxProfit maxProfit=new BuyandSellMaxProfit();
        System.out.println("Here-->"+maxProfit.maxProfit(i));
    }
}
