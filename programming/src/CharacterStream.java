import java.util.*;

public class CharacterStream {
	Map<Character, Integer> map = new HashMap<>();
	Deque<Character> queue = new LinkedList<>();
	//Insert one char from stringstream
	public void Insert(char ch) {
		map.put(ch, map.getOrDefault(ch, 0) + 1);
		if(map.get(ch) != 1) queue.remove(ch);
		if(map.get(ch) == 1) queue.add(ch);
	}
	//return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		return queue.isEmpty() ? '#' : queue.peek();
	}
}
