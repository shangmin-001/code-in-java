package _21_Merge_Two_Sorted_Lists;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/10 8:00 上午
 * @project code-in-java
 */
import LinkedList.ListNode;

public class Solution_1 {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode head = null;
    ListNode cur = null;
    while (l1 != null && l2 != null) {
      ListNode minListNode = null;
      if (l1.val <= l2.val) {
        minListNode = l1;
        l1 = l1.next;
      } else {
        minListNode = l2;
        l2 = l2.next;
      }
      if (cur == null) {
        cur = minListNode;
      } else {
        cur.next = minListNode;
        cur = minListNode;
      }
      if (head == null) {
        head = minListNode;
      }
    }
    if (l1 == null) {
      cur.next = l2;
    }
    if (l2 == null) {
      cur.next = l1;
    }
    return head;
  }
}
