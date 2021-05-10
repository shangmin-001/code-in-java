package _21_Merge_Two_Sorted_Lists;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/10 8:04 上午
 * @project code-in-java
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import LinkedList.*;

public class SolutionTest {
  Solution_1 solution1 = new Solution_1();

  @Test
  void solution_1() {
    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {1, 2, 3, 4, 5};
    int[] res = {1, 1, 2, 2, 3, 3, 4, 4, 5};

    LinkedNodeList l1 = new LinkedNodeList(arr1);
    LinkedNodeList l2 = new LinkedNodeList(arr2);

    ListNode newHead = solution1.mergeTwoLists(l1.GetHead(), l2.GetHead());
    LinkedNodeList resL = new LinkedNodeList(newHead);
    LinkedNodeList expL = new LinkedNodeList(res);

    resL.PrintValueList();

    assertTrue(resL.ValueListEquals(expL));
  }
}
