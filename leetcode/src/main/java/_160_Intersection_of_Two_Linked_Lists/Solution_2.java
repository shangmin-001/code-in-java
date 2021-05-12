package _160_Intersection_of_Two_Linked_Lists;

import LinkedList.ListNode;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/12 9:40 下午
 * @project code-in-java
 */
import LinkedList.ListNode;

public class Solution_2 {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    // 边界要保护好
    if (headA == null || headB == null) {
      return null;
    }

    ListNode cur1 = headA;
    ListNode cur2 = headB;
    boolean flag1 = false; // 本来也想按照官方答案提供那么写的但是自己担心出现死循环。实际上不会
    boolean flag2 = false;

    while (cur1 != cur2) {
      if (cur1 != null) {
        cur1 = cur1.next;
        if (cur1 == null && !flag1) {
          cur1 = headB;
          flag1 = true;
        }
      }

      if (cur2 != null) {
        cur2 = cur2.next;
        if (cur2 == null && !flag2) {
          cur2 = headA;
          flag2 = true;
        }
      }
    }
    return cur1;
  }

  public ListNode getIntersectionNode_1(ListNode headA, ListNode headB) {

    if (headA == null || headB == null) {
      return null;
    }

    ListNode cur1 = headA;
    ListNode cur2 = headB;

    while (cur1 != cur2) {
      if (cur1 != null) {
        cur1 = cur1.next;
        if (cur1 == null) {
          cur1 = headB;
        }
      }

      if (cur2 != null) {
        cur2 = cur2.next;
        if (cur2 == null) {
          cur2 = headA;
        }
      }
    }
    return cur1;
  }
}
