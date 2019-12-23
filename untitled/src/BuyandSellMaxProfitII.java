public class BuyandSellMaxProfitII {

    public int MaxProfit(int[] prices){

        if(prices==null||prices.length==0){

            return 0; // null check and return 0;
        }

        int profit=0;
        for (int i = 0; i <prices.length-1; i++) {
            if(prices[i+1]>prices[i]){ // if prices of next day is larger then previous day, in that case we can make profit

                System.out.println("Prices-->"+prices[i+1]+" and -->"+prices[i]);
                profit+=prices[i+1]-prices[i]; // getting profit and adding the profit, as we can make multiple transactions in this question
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        BuyandSellMaxProfitII buyandSellMaxProfitII=new BuyandSellMaxProfitII();
        int[] price={7,1,5,3,6,4};
        System.out.println("Profit-->"+buyandSellMaxProfitII.MaxProfit(price));
    }
}
