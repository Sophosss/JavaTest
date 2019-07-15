package leetcode;

public class AddTwoNum {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		long num1 = l1.val, num2 = l2.val,c1 = 0, c2 = 0,c3 = 0, c4 =0;
		while (l1.next != null){
			c3 += 1;
			c4 = (long) Math.pow(10,c3);
			num1 = l1.next.val * c4 +num1;
			l1 = l1.next;
		}
		while (l2.next != null){
			c2 += 1;
			c1 = (long) Math.pow(10,c2);
			num2 = l2.next.val * c1 +num2;
			l2 = l2.next;
		}
		num1 = num1 + num2;
		String s = num1 + "";
		int n = s.length();
		String s1 = Character.toString(s.charAt(0));
		ListNode listNode = new ListNode(Integer.parseInt(s1));
		for (int i = 1; i < n; i++) {
			String s2 = Character.toString(s.charAt(i));
			ListNode listNode1 = new ListNode(Integer.parseInt(s2));
			listNode1.next = listNode;
			listNode = listNode1;
		}
		return listNode;
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

		ListNode listNode = addTwoNumbers(l1,l2);
		while (listNode!=null){
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}
}
