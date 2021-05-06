package _206_Reverse_Linked_List;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/6 2:28 下午
 * @project code-in-java
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import LinkedList.*;

class SolutionTests {
  LinkedNodeList list1, list2;

  @BeforeEach
  void initLinkedList() {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {5, 4, 3, 2, 1};
    list1 = new LinkedNodeList(arr1);
    list2 = new LinkedNodeList(arr2);
  }

  @Test
  void solution_1() {
    Solution_1 solution_1 = new Solution_1();
    list1.PrintValueList();
    ListNode newH = solution_1.reverse(list1.GetHead());
    list1.SetHead(newH);
    list1.PrintValueList();
    list2.PrintValueList();
    assertTrue(list1.ValueListEquals(list2));
  }

  @Test
  void solution_2() {
    Solution_2 solution_1 = new Solution_2();
    list1.PrintValueList();
    ListNode newH = solution_1.reverse(list1.GetHead());
    list1.SetHead(newH);
    list1.PrintValueList();
    list2.PrintValueList();
    assertTrue(list1.ValueListEquals(list2));
  }

  @Test
  void solution_3() {
    Solution_3 solution_1 = new Solution_3();
    list1.PrintValueList();
    ListNode newH = solution_1.reverse(list1.GetHead());
    list1.SetHead(newH);
    list1.PrintValueList();
    list2.PrintValueList();
    assertTrue(list1.ValueListEquals(list2));
  }
}
