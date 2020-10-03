package Week2;

public class ReverseKGroup {
    static class ListNode {
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode pre = res;
        ListNode first = pre.next;
        ListNode cur = first;
        int count = 0;
        while (cur != null) {
            count++;
            if (count == k) {
                ListNode last = cur;
                pre.next = reverseOneGroup(first, last);
                pre = first;
                first = pre.next;
                cur = first;
                count = 0;
            }
            else {
                cur = cur.next;
            }
        }
        return res.next;
    }
    private ListNode reverseOneGroup(ListNode first, ListNode last) {
        while (first != last) {
            ListNode cur = first;
            first = first.next;
            cur.next = last.next;
            last.next = cur;
        }
        return last;
    }

    public static void main(String[] args) {
        ReverseKGroup dd = new ReverseKGroup();
        ListNode listnode = new ListNode(0);
        listnode.next = new ListNode(1);
        listnode.next.next = new ListNode(2);
        listnode.next.next.next = new ListNode(3);
        listnode.next.next.next.next = new ListNode(4);
        listnode.next.next.next.next.next = new ListNode(5);

        System.out.println(dd.reverseKGroup(listnode,4).val);

    }
}
