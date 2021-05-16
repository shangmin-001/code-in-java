package _121_Best_Time_to_Buy_and_Sell_Stock;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date
 * @project code-in-java
 */
public class Solution {
  public int maxProfit(int[] prices) {

    int maxPro = 0;
    int minVal = prices[0];

    for (int i = 1; i < prices.length; i++) {
      maxPro = (prices[i] - minVal) > maxPro ? prices[i] - minVal : maxPro;
      minVal = prices[i] > minVal ? minVal : prices[i];
    }
    return maxPro;
  }
}
