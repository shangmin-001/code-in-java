package _121_Best_Time_to_Buy_and_Sell_Stock;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date
 * @project code-in-java
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  void solution_1() {
    int arr[] = {7, 1, 5, 3, 6, 4};
    int maxPro = solution.maxProfit(arr);

    assertEquals(5, maxPro);
  }
}
