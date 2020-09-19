
// LeetCode 86 - Partition List around a value X

public class PartitionList {

    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode partitionList(ListNode head, int x) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);
        ListNode p1 = node1;
        ListNode p2 = node2;
        while (head != null) {
            if (head.val < x) {
                p1.next = head;
                p1 = p1.next;
            }
            else {
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }
        p2.next = null;
        p1.next = node2.next;
        return node1.next;
    }
    public static void main(String[] args) {
    }
}
