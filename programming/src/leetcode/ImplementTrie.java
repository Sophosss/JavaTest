package leetcode;

class Node2{
	Node2 nums[] = new Node2[26];
	boolean flag;
}
public class ImplementTrie {
	Node2 root = new Node2();
	public ImplementTrie() {

	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		Node2 p = root;
		for(int c : word.toCharArray()){
			if(p.nums[c - 'a'] == null) p.nums[c - 'a'] = new Node2();
			p = p.nums[c - 'a'];
		}
		p.flag = true;
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		Node2 p = root;
		for(int c : word.toCharArray()){
			if(p.nums[c - 'a'] == null) return false;
			p = p.nums[c - 'a'];
		}
		return p.flag;
	}

	/** Returns if there is any word in the trie that starts with the given prefix. */
	public boolean startsWith(String prefix) {
		Node2 p = root;
		for(int c : prefix.toCharArray()){
			if(p.nums[c - 'a'] == null) return false;
			p = p.nums[c - 'a'];
		}
		return true;
	}
}

