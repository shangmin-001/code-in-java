package _1_Two_Sum;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/9 11:07 下午
 * @project code-in-java
 */
import java.util.*;

public class Solution_2 {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> hashTable = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (hashTable.containsKey(target - nums[i])) {
        return new int[] {hashTable.get(target - nums[i]), i};
      }
      hashTable.put(nums[i], i);
    }
    return new int[0];
  }
}

// 这种代码go 和python都写过，居然这种接法忘了，瓜娃子
