package linked_list;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {}

    ListNode(int val) {
        this(val, null);
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
