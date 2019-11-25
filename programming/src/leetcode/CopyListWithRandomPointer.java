package leetcode;

import java.util.HashMap;
import java.util.Map;
class Node3 {
	public int val;
	public Node3 next;
	public Node3 random;

	public Node3() {}

	public Node3(int _val,Node3 _next,Node3 _random) {
		val = _val;
		next = _next;
		random = _random;
	}
};
public class CopyListWithRandomPointer {
	public Node3 copyRandomList(Node3 head) {
		if(head == null) return null;
		Node3 cur = head;
		Map<Node3, Node3> map = new HashMap<>();
		while(cur != null){
			map.put(cur, new Node3(cur.val, null, null));
			cur = cur.next;
		}
		cur = head;
		while(cur != null){
			map.get(cur).next = map.get(cur.next);
			map.get(cur).random = map.get(cur.random);
			cur = cur.next;
		}
		return map.get(head);
	}
}
