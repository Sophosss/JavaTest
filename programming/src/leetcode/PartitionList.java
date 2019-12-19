package leetcode;

public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		ListNode l1 = new ListNode(0);
		ListNode cur1 = l1;
		ListNode l2 = new ListNode(0);
		ListNode cur2 = l2;
		while (head != null){
			if (head.val >= x){
				l2.next = head;
				l2 = l2.next;
			}
			else{
				l1.next = head;
				l1 = l1.next;
			}
			head = head.next;
		}
		l2.next = null;
		l1.next = cur2.next;
		return cur1.next;
	}
}
