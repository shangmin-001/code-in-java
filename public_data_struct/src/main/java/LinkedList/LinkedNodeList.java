package LinkedList;

import java.util.Objects;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/6 5:10 下午
 * @project code-in-java
 */
public class LinkedNodeList {
  private ListNode head = null;

  public LinkedNodeList() {}

  public LinkedNodeList(int[] arr) {
    if (arr == null || arr.length == 0) {
      return;
    }
    this.head = new ListNode(arr[0]);
    ListNode cur = this.head;
    for (int i = 1; i < arr.length; i++) {
      cur.next = new ListNode(arr[i]);
      cur = cur.next;
    }
  }

  public LinkedNodeList(ListNode h) {
    this.head = h;
  }

  public void SetHead(ListNode h) {
    this.head = h;
  }

  public ListNode GetHead() {
    return this.head;
  }

  public ListNode GetLast() {
    ListNode cur = this.head;
    while (cur.next != null) {
      cur = cur.next;
    }
    return cur;
  }

  public void PrintValueList() {
    ListNode cur = this.head;
    while (cur != null) {
      System.out.print("->" + cur.val);
      cur = cur.next;
    }
    System.out.println();
  }

  public void AppendListNode(ListNode newNode) {
    ListNode pre = this.head;
    if (pre == null) {
      this.head = newNode;
    }
    while (pre.next != null) {
      pre = pre.next;
    }
    pre.next = newNode;
    return;
  }

  public ListNode GetListNodeWithIndex(int index) {
    ListNode cur = this.head;
    while (index > 0) {
      cur = cur.next;
      index--;
    }
    return cur;
  }

  public boolean ValueListEquals(LinkedNodeList lnl) {
    if (lnl == null) {
      return false;
    }
    ListNode cur1 = this.head;
    ListNode cur2 = lnl.head;
    for (; cur1 != null && cur2 != null; cur1 = cur1.next, cur2 = cur2.next) {
      if (!cur1.ValueEquals(cur2)) {
        return false;
      }
    }
    if (cur1 == null && cur2 == null) {
      return true;
    }

    return false;
  }
}
