//  Leetcode 24
package Week2;

public class SwapPairs {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode preHead = temp;

        while (head != null && head.next != null) {
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            preHead.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            preHead = firstNode;
            head = firstNode.next;
        }
        return temp.next;
    }
}
