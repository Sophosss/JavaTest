import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class CircleNode {
	public ListNode EntryNodeOfLoop(ListNode pHead)
	{
		if(pHead==null||pHead.next==null) return null;
		Set<ListNode> set=new HashSet<>();
		while(pHead!=null){
			if(set.contains(pHead)) return pHead;
			set.add(pHead);
			pHead=pHead.next;
		}
		return null;
	}
}
