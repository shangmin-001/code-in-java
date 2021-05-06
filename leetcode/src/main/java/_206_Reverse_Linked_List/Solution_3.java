package _206_Reverse_Linked_List;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/5 12:17 上午
 * @project code-in-java
 */
import LinkedList.ListNode;

public class Solution_3 {
  public ListNode reverse(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode curr = head;
    ListNode newHead = head;
    ListNode prev = null;
    /*
     * 选择一条极其沙雕的解法；A->B->C;
     * 如果判断下一个节点是否为空 (A)curr.next，那么意味着
     * curr(A) 和 (B)next的关系还保持着。
     * 需要做如下操作：
     *     A.next 需要指向A的前一个节点
     *     curr 要变成B; newHead变成了B;新链表的头是B，但是新链表头的next关系还没建立
     *     还要存着前一个节点 prev =A
     *
     * 收官的时候：还要把 newHead.next = prev;补上
     *
     * 所以还是按照solution_2的解法，就判断当前。上线解法，就是想远了
     * */
    while (curr.next != null) {
      newHead = curr.next;
      curr.next = prev;
      prev = curr;
      curr = newHead;
    }
    newHead.next = prev;

    return newHead;
  }
}
