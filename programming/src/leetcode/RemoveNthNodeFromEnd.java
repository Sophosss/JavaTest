package leetcode;

public class RemoveNthNodeFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode first = new ListNode(0);
		first.next = head;
		ListNode fast = first;
		ListNode low = first;
		for (int i = 0; i < n; i++){
			fast = fast.next;
		}
		while (fast.next != null){
			fast = fast.next;
			low = low.next;
		}
		low.next = low.next.next;
		return first.next;
	}
}
