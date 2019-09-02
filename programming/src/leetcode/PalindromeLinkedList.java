package leetcode;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		ListNode pre = null;
		ListNode cur = null;
		ListNode fast = head;
		ListNode slow = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		while(head != slow){
			cur =  head.next;
			head.next = pre;
			pre = head;
			head = cur;
		}
		if(fast != null) slow = slow.next;
		return ok(pre, slow);
	}
	private boolean ok(ListNode l1, ListNode l2){
		while(l1 != null){
			if(l1.val != l2.val) return false;
			else {
				l1 = l1.next;
				l2 = l2.next;
			}
		}
		return true;
	}
}
