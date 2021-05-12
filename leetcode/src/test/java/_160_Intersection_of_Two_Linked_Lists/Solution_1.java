package _160_Intersection_of_Two_Linked_Lists;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/11 10:16 下午
 * @project code-in-java
 */
import static org.junit.jupiter.api.Assertions.*;

import _160_Intersection_of_Two_Linked_Lists.*;
import org.junit.jupiter.api.Test;
import LinkedList.*;

class SolutionTest {
  Solution_1 solution1 = new Solution_1();
  Solution_2 solution2 = new Solution_2();

  @Test
  void solution_1() {
    int[] arr1 = {4, 1, 8, 4, 5};
    int[] arr2 = {5, 6, 1, 8, 4, 5};
    int[] res = {8, 4, 5};

    ListNode[] ll = SpecialListNodeConstructor.GeneTwoListWithIntersection(arr1, arr2, 2, 3, 8);
    // 测试用例就不做保护了
    ListNode l1 = ll[0];
    ListNode l2 = ll[1];

    ListNode newHead = solution1.getIntersectionNode(l1, l2);
    LinkedNodeList resL = new LinkedNodeList(newHead);
    LinkedNodeList expL = new LinkedNodeList(res);

    resL.PrintValueList();

    assertTrue(resL.ValueListEquals(expL));
  }

  @Test
  void solution_2() {
    int[] arr1 = {4, 1, 8, 4, 5};
    int[] arr2 = {5, 6, 1, 8, 4, 5};
    int[] res = {8, 4, 5};

    ListNode[] ll = SpecialListNodeConstructor.GeneTwoListWithIntersection(arr1, arr2, 2, 3, 8);
    // 测试用例就不做保护了
    ListNode l1 = ll[0];
    ListNode l2 = ll[1];

    ListNode newHead = solution2.getIntersectionNode(l1, l2);
    LinkedNodeList resL = new LinkedNodeList(newHead);
    LinkedNodeList expL = new LinkedNodeList(res);

    resL.PrintValueList();

    assertTrue(resL.ValueListEquals(expL));
  }
}
