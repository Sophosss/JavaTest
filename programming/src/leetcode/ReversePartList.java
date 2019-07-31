package leetcode;

public class ReversePartList {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode pre = null;
		ListNode cur = head;
		ListNode nex = null;
		ListNode con = null;
		ListNode tail = null;
		while (m > 1){
			pre = cur;
			cur = cur.next;
			m--;
			n--;
		}
		con = pre;
		tail = cur;
		while (n > 0){
			nex = cur.next;
			cur.next = pre;
			pre = cur;
			cur = nex;
			n--;
		}
		if (con != null){
			con.next = pre;
		}else {
			head = pre;
		}
		tail.next = cur;
		return head;
	}
}
