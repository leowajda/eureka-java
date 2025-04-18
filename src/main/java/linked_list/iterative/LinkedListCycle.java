package linked_list.iterative;

import linked_list.ListNode;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }

        return false;
    }

}
