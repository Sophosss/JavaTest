package leetcodeWeekly;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class One167 {
	int num = 0;
	int i = 0;
	public int getDecimalValue(ListNode head) {
		if(head == null) return 0;
		dfs(head);
		return num;
	}
	public void dfs(ListNode head){
		if(head == null) return;
		dfs(head.next);
		num += (int) Math.pow(2, i++) * head.val;
	}
}
