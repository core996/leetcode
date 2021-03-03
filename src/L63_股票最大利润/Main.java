package L63_股票最大利润;

/**
 * @Description: 股票最大利润63 ,动态规划
 * @Author: Wuxin
 * @Date: Create in  2021-02-23 16:33
 */
public class Main {
    public static void main(String[] args) {
        int[] data = {7,6,4,3,1};
        System.out.println(maxProfit(data));
    }


    /**
     *  n^2
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int max = 0 ;
        for(int x = 0 ; x < prices.length ; x++ ){
            for (int y = x + 1 ; y < prices.length ; y++ ){
                if (max < prices[y]-prices[x]){
                    max =  prices[y]-prices[x] ;
                }
            }
        }
        return max ;
    }
}
