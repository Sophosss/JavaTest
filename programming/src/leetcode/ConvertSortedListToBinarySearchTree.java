package leetcode;

public class ConvertSortedListToBinarySearchTree {
	public TreeNode sortedListToBST(ListNode head) {
		if(head == null) return null;
		return go(head, null);
	}
	public TreeNode go(ListNode head, ListNode tail){
		if(head == tail) return null;
		ListNode slow = head;
		ListNode fast = head;
		while(fast != tail && fast.next != tail){
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode root = new TreeNode(slow.val);
		root.left = go(head, slow);
		root.right = go(slow.next, tail);
		return root;
	}
}
