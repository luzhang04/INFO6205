package Week2;
// Leetcode 237
public class DeleteNode {
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
    public void deleteNode (ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}