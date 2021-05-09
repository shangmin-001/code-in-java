package _1_Two_Sum;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/9 11:10 下午
 * @project code-in-java
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

  @Test
  void solution_1() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] indexes = {0, 1};

    Solution_1 solution_1 = new Solution_1();
    assertArrayEquals(solution_1.twoSum(nums, target), indexes);
  }
}
