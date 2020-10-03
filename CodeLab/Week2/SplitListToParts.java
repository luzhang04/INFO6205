// Leetcode 725
package Week2;

public class SplitListToParts {
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
    public ListNode[] splitListToParts(ListNode root, int k) {
        int count = 0;
        ListNode temp = root;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int size = count / k;
        int remain = count % k;
        ListNode[] res = new ListNode[k];
        temp = root;
        for (int i = 0; temp != null && i < k; i++) {
            res[i] = temp;
            int realSize = size + (remain-- > 0 ? 1 : 0);
            for (int j = 0; temp != null && j < realSize - 1; j++) {
                temp = temp.next;
            }
            ListNode dummy = temp.next;
            temp.next = null;
            temp = dummy;
        }
        return res;
    }
}
