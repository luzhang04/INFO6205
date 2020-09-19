// LeetCode 708 - Insert into a Sorted Circular Linked List

public class InsertIntoList {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode insertIntoList(ListNode head, int insertVal) {
        if (head == null) {
            head = new ListNode(insertVal, null);
            head.next = head;
            return head;
        }
        ListNode cur = head;
        while (cur != null) {
            if (cur.val < cur.next.val) {
                if (cur.val <= insertVal && insertVal <= cur.next.val) {
                    cur.next = new ListNode(insertVal, cur.next);
                    break;
                }
            }
            else if (cur.val > cur.next.val) {
                if (cur.val <= insertVal || insertVal <= cur.next.val) {
                    cur.next = new ListNode(insertVal, cur.next);
                    break;
                }
            }
            else {
                if (cur.next == head) {
                    cur.next = new ListNode(insertVal, head);
                    break;
                }
            }
            cur = cur.next;
        }
        return head;
    }
    public static void main(String[] args) {
    }

}
