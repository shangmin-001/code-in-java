package LinkedList;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/4 10:14 下午
 * @project code-in-java
 */
public class ListNode {
  public ListNode next;
  int val;

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode() {}

  public ListNode(int val, ListNode next) {
    this.next = next;
    this.val = val;
  }

  public boolean ValueEquals(ListNode ln) {
    if (ln == null) {
      return false;
    }
    return ln.val == this.val;
  }
}
