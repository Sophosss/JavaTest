import java.util.ArrayDeque;
import java.util.Deque;

public class CircleNode {
	public ListNode EntryNodeOfLoop(ListNode pHead)
	{
		Deque<Integer> deque = new ArrayDeque<>();
		ListNode node = new ListNode(0);
		while (pHead!=null&&pHead.next!=null){
			deque.add(pHead.val);
			pHead = pHead.next;
			if (deque.contains(pHead.val)){
				return pHead;

			}
		}
		return null;
	}
}
