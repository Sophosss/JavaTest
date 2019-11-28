package leetcode;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if(head == null) return null;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode p = head;
		int count = 0;
		while(head != null){
			head = head.next;
			dummy = dummy.next;
			count++;
		}
		dummy.next = p;
		k = count - (k % count) - 1;
		for(int i = 0; i < k; i++){
			p = p.next;
		}
		ListNode cur = p.next;
		p.next = null;
		return cur;
	}
}
