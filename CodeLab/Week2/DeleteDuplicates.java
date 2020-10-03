// Leetcode 82
package Week2;

public class DeleteDuplicates {
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode pre = res;

        while (pre != null) {
            boolean f = false;
            while (pre.next != null && pre.next.next != null && pre.next.val == pre.next.next.val) {
                pre.next = pre.next.next;
                f = true;
            }
            if (f) {
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
        }
        return res.next;
    }
}
