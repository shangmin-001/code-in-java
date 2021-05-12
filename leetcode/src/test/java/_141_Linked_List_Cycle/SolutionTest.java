package _141_Linked_List_Cycle;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/12
 * @project code-in-java
 */
import LinkedList.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  Solution_1 solution_1 = new Solution_1();

  @Test
  void solution_1() {
    int[] arr = {3, 2, 0, -4};
    ListNode head = SpecialListNodeConstructor.GeneCircleList(arr, 1);
    assertTrue(solution_1.hasCycle(head));
  }
}
