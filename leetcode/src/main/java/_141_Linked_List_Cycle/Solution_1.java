package _141_Linked_List_Cycle;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/12
 * @project code-in-java
 */
import LinkedList.ListNode;

public class Solution_1 {
  public boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }
    ListNode oneStepPoint = head;
    ListNode TwoStepPoint = head.next;
    // 问题是解决了，其实按照官方答案，还有优化，不做无用功；
    while (TwoStepPoint != oneStepPoint) {
      oneStepPoint = oneStepPoint.next;
      if (TwoStepPoint != null) {
        TwoStepPoint = TwoStepPoint.next;
      }
      if (TwoStepPoint != null) {
        TwoStepPoint = TwoStepPoint.next;
      }
    }
    return oneStepPoint != null;
  }
}
