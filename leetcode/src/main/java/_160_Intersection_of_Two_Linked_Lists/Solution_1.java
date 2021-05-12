package _160_Intersection_of_Two_Linked_Lists;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/11 10:13 下午
 * @project code-in-java
 */
import LinkedList.ListNode;

public class Solution_1 {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }
    ListNode lastNodeOfA = null;
    ListNode curNode = headA;
    while (curNode != null) {
      lastNodeOfA = curNode;
      curNode = curNode.next;
    }
    lastNodeOfA.next = headB;

    ListNode firNode = headA;
    ListNode secNode = headA.next;

    while (firNode != secNode) {
      firNode = firNode.next;
      if (secNode == null) { // 细节二
        break;
      }
      secNode = secNode.next;
      if (secNode == null) { // 当时这个！=null弄了好长时间
        break;
      }
      secNode = secNode.next;
    }
    if (secNode == null) {
      lastNodeOfA.next = null; // 细节1，忽略了
      return null;
    }

    int lengthOfCircle = 1;
    firNode = firNode.next;

    while (firNode != secNode) {
      firNode = firNode.next;
      lengthOfCircle++;
    }

    secNode = firNode = headA;

    while (lengthOfCircle != 0) {
      secNode = secNode.next;
      lengthOfCircle--;
    }

    while (firNode != secNode) {
      firNode = firNode.next;
      secNode = secNode.next;
    }
    lastNodeOfA.next = null;
    return secNode;
  }
  // ps：当出现问题的时候，一个逻辑一个逻辑往前推，肯定可以找到问题所在的
}
