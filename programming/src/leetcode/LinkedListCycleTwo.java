package leetcode;

public class LinkedListCycleTwo {
	public ListNode detectCycle(ListNode head) {
		if (head == null) return head;
		ListNode slow = head;
		ListNode fast = head;
		ListNode temp = head;
		while (fast != null && fast.next != null) {
		    slow = slow.next;
		    fast = fast.next.next;
		    if (slow == fast) {
		    	while (temp != fast){
		    		temp = temp.next;
		    		fast = fast.next;
				}
				return fast;
			}
		}
		return null;
	}
}
