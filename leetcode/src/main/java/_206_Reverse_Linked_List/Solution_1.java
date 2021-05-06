package _206_Reverse_Linked_List;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/4 9:23 下午
 * @project code-in-java
 */
import LinkedList.ListNode;

public class Solution_1 {
  public ListNode reverse(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode newList = this.reverse(head.next);
    head.next.next = head;
    head.next = null;
    return newList;
  }
}
