package leetcode;
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
        next = null;
     }
 }
public class SwapPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null||head.next == null){
			return head;
		}
		ListNode second = head.next;
		ListNode third = second.next;
		second.next = head;
		head.next = swapPairs(third);
		return second;
	}
}
