class leet206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;         // Previous node
        ListNode curr = head;         // Current node

        while (curr != null) {
            ListNode nextNode = curr.next; // Save next node
            curr.next = prev;              // Reverse current link
            prev = curr;                   // Move prev forward
            curr = nextNode;               // Move curr forward
        }

        return prev;  // New head
    }
}
