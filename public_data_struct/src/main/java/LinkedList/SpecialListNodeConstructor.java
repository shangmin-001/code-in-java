package LinkedList;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date 2021/5/12 10:21 上午
 * @project code-in-java
 */
public class SpecialListNodeConstructor {

  public static ListNode[] GeneTwoListWithIntersection(
      int[] arr1, int[] arr2, int pri1Node, int pri2Node, int totalNode) {
    if (arr1 == null || arr2 == null) {
      return null;
    }
    if (!(arr1.length <= totalNode && arr1.length >= pri1Node)) {
      return null;
    }
    if (!(arr2.length <= totalNode && arr2.length >= pri2Node)) {
      return null;
    }

    ListNode headA = null;
    ListNode headB = null;
    ListNode interSectionNode = null;
    if (arr1.length > 0) {
      LinkedNodeList l = new LinkedNodeList(arr1);
      interSectionNode = l.GetListNodeWithIndex(pri1Node);
      l.PrintValueList();
      headA = l.GetHead();
    }
    int[] arr2P = new int[pri2Node];
    System.arraycopy(arr2, 0, arr2P, 0, pri2Node);

    LinkedNodeList l2 = new LinkedNodeList(arr2P);
    l2.AppendListNode(interSectionNode);
    l2.PrintValueList();
    headB = l2.GetHead();

    return new ListNode[] {headA, headB};
  }

  public static ListNode GeneCircleList(int[] arr, int startPosCir) {
    LinkedNodeList l = new LinkedNodeList(arr);
    ListNode lastNode = l.GetLast();
    ListNode ls = l.GetListNodeWithIndex(startPosCir);
    lastNode.next = ls;
    return l.GetHead();
  }
}
