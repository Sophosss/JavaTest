package leetcode;

public class AddTwoNum {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode p = dummy;
		int num1 = 0;
		int temp =0;
		while(l1 != null || l2 != null || num1 != 0){
			temp = l1 == null ? 0 : l1.val;
			temp += l2 == null ? 0 : l2.val;
			temp += num1;
			num1 = temp / 10;
			ListNode node = new ListNode(temp % 10);
			p.next = node;
			p = node;
			l1 = l1 == null ? l1 : l1.next;
			l2 = l2 == null ? l2 : l2.next;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
//		ListNode l1 = new ListNode(9);
//		ListNode l2 = new ListNode(1);
//		ListNode l3 = new ListNode(9);
//		ListNode l4 = new ListNode(9);
//		ListNode l5 = new ListNode(9);
//		ListNode l6 = new ListNode(9);
//		ListNode l7 = new ListNode(9);
//		ListNode l8 = new ListNode(9);
//		ListNode l9 = new ListNode(9);
//		ListNode l10 = new ListNode(9);
//		ListNode l11 = new ListNode(9);
//		l2.next = l3;
//		l3.next = l4;
//		l4.next = l5;
//		l5.next = l6;
//		l6.next = l7;
//		l7.next = l8;
//		l8.next = l9;
//		l9.next = l10;
//		l10.next = l11;

		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(0);
		ListNode l3 = new ListNode(1);
		ListNode l4 = new ListNode(6);
		l1.next = l3;
		l3.next = l4;

		AddTwoNum addTwoNum = new AddTwoNum();
		ListNode listNode = addTwoNum.addTwoNumbers(l1,l2);
		while (listNode!=null){
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}
}
