package _206_Reverse_Linked_List;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/4 11:18 下午
 * @project code-in-java
 */
import LinkedList.ListNode;

public class Solution_2 {
  public ListNode reverse(ListNode head) {

    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    // 为山九仞功亏一篑 return curr;
    return prev;
  }
}
