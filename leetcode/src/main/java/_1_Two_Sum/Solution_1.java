package _1_Two_Sum;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/9 10:43 下午
 * @project code-in-java
 */
public class Solution_1 {
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      int y = target - nums[i];
      for (int j = 0; j < nums.length; j++) {
        if (j != i && nums[j] == y) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {0, 0};
  }
}
