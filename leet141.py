from typing import Optional

class ListNode:
    def __init__(self, val: int = 0, next: Optional['ListNode'] = None):
        self.val = val
        self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        slow = head
        fast = head

        while fast and fast.next and slow:
            slow = slow.next         # move 1 step
            fast = fast.next.next    # move 2 steps

            if slow == fast:
                return True

        return False
