package _53_Maximum_Subarray;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/9 10:32 上午
 * @project code-in-java
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * CaseList
 * 1. GIVEN 长度大于1的数组 WHEN 正常执行 THEN  得到最大子序列
 * 2. GIVEN 长度等于1的数组 WHEN 正常执行 THEN  结果就是自己
 * */

public class SolutionTest {
  Solution_1 solution_1 = new Solution_1();

  @Test
  void solution_1() {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int res = 6;
    assertEquals(res, solution_1.maxSubArray(arr));
  }

  @Test
  void solution_1_1() {
    int[] arr = {-2};
    int res = -2;
    assertEquals(res, solution_1.maxSubArray(arr));
  }
}
