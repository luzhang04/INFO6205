// LeetCode 1290 - Convert Binary Number in a Linked List to Integer

public class GetDecimalValue {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while (head != null) {
            sum = sum * 2 + head.val;
            head = head.next;
        }
        return sum;
    }
    public static void main(String[] args) {
        GetDecimalValue gdv = new GetDecimalValue();
        ListNode node = new ListNode();
        node.next = new ListNode(0);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(0);
        node.next.next.next.next = new ListNode(1);
        node.next.next.next.next.next = new ListNode(1);
        System.out.println(gdv.getDecimalValue(node));
    }
}
