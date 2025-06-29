class leet203 {
    public ListNode removeElements(ListNode head, int val) {
        // Dummy node before head to handle head deletion easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next; // skip the node
            } else {
                curr = curr.next; // move to next node
            }
        }

        return dummy.next; // return the new head
    }
}
