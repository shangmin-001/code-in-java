package _53_Maximum_Subarray;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/9 10:27 上午
 * @project code-in-java
 */
public class Solution_1 {
  public int maxSubArray(int[] nums) {
    int maxSumOfSubArray = nums[0];
    int maxSumOfPreItem = nums[0];

    for (int i = 1; i < nums.length; i++) {
      maxSumOfPreItem = maxSumOfPreItem + nums[i] > nums[i] ? maxSumOfPreItem + nums[i] : nums[i];
      maxSumOfSubArray = maxSumOfSubArray > maxSumOfPreItem ? maxSumOfSubArray : maxSumOfPreItem;
    }

    return maxSumOfSubArray;
  }
}
