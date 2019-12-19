package leetcode;

public class ReorderList {
	public void reorderList(ListNode head) {
		if(head == null || head.next == null) return;
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode pre = slow;
		ListNode cur = slow.next;
		while (cur.next != null){
			ListNode tmp = cur.next;
			cur.next = tmp.next;
			tmp.next = pre.next;
			pre.next = tmp;
		}
		ListNode l1 = head;
		ListNode l2 = slow.next;
		while (l1 != slow){
			slow.next = l2.next;
			l2.next = l1.next;
			l1.next = l2;
			l1 = l2.next;
			l2 = slow.next;
		}
	}
}
