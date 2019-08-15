package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergekSortedLists {
	//递归套递归
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) return null;
		int n = lists.length - 1;
		return mergek(lists, 0, n);
	}
	private ListNode mergek(ListNode [] lists, int start, int end){
		if (start == end) return lists[start];
		int mid = (start + end) >>> 1;
		ListNode l1 = mergek(lists, start, mid);
		ListNode l2 = mergek(lists,mid + 1, end);
		return merge(l1, l2);
	}
	private ListNode merge(ListNode l1, ListNode l2){
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		if (l1.val < l2.val){
			l1.next = merge(l1.next, l2);
			return l1;
		}else {
			l2.next = merge(l1, l2.next);
			return l2;
		}
	}

	//优先级队列
	public ListNode mergeKLists2(ListNode[] lists) {
		if (lists == null || lists.length == 0) return null;
		PriorityQueue<ListNode> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.val - o2.val, 0));
		for(ListNode listNode : lists){
			queue.add(listNode);
		}
		ListNode dummy = new ListNode(0);
		ListNode p = dummy;
		while (!queue.isEmpty()){
			p.next = queue.poll();
			p = p.next;
			if (p.next != null) queue.add(p.next);
		}
		return dummy.next;
	}
}
