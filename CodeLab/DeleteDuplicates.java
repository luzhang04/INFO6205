// LeetCode 83 - Remove duplicates from sorted Link List

public class DeleteDuplicates {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode DeleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            }
            else {
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
    }
}
