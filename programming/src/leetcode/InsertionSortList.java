package leetcode;

public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		ListNode dummy = new ListNode(0);
		while (head != null){
			ListNode cur = dummy;
			ListNode next = head.next;
			while (cur.next != null && cur.next.val < head.val) cur = cur.next;
			head.next = cur.next;
			cur.next = head;
			head = next;
		}
		return dummy.next;
	}
}
