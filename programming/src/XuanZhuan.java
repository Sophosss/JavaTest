import com.sun.org.apache.bcel.internal.generic.LNEG;

import java.util.Stack;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}
public class XuanZhuan {
	public ListNode deleteDuplication(ListNode pHead) {
		ListNode first = new ListNode(0);
		first.next = pHead;
		ListNode p = pHead;
		ListNode pre = first;
		while (p!=null && p.next!=null){
			if (p.val == p.next.val){
				int temp = p.val;
				while (p!=null && p.val ==temp){
					p = p.next;
				}
				pre.next = p;
			}else {
				pre = p;
				p = p.next;
			}
		}
		return first.next;
	}


	public static void main(String[] args) {

		XuanZhuan xuanZhuan = new XuanZhuan();
		String str = "i am a boy. ";
		String s = "-2147483647";
		System.out.println(Integer.valueOf(s));

	}
}

