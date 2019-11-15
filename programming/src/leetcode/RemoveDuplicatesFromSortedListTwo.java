package leetcode;

public class RemoveDuplicatesFromSortedListTwo {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode cur = dummy;
		while(head != null && head.next != null){
			if(head.val == head.next.val){
				int temp = head.val;
				while(head != null && head.val == temp) head = head.next;
				cur.next = head;
			}
			else {
				cur = head;
				head = head.next;
			}
		}
		return dummy.next;
	}
}
