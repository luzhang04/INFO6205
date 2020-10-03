package Week2;
// Leetcode 1474
public class DeleteNodes {
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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            int i = m;
            int j = n;
            while (cur != null && i > 0) {
                pre = cur;
                cur = cur.next;
                i--;
            }
            while (cur != null && j > 0) {
                cur = cur.next;
                j--;
            }
            pre.next = cur;

        }
        return head;
    }
}
