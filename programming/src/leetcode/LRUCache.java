package leetcode;
import java.util.HashMap;
import	java.util.LinkedHashMap;

import java.util.Map;
class Node{
	Node pre, next;
	int key, val;
	public Node(int key, int val){
		this.key = key;
		this.val = val;
	}
}
public class LRUCache {
	Node head;
	Node tail;
	Map<Integer, Node> map = new HashMap<>();
	int cap;
	public LRUCache(int capacity) {
		head = new Node(0,0);
		tail = new Node(0,0);
		head.next = tail;
		tail.pre = head;
		this.cap = capacity;
	}

	public int get(int key) {
		if(map.containsKey(key)){
			Node node = map.get(key);
			remove(node);
			add(node);
			return node.val;
		}else return -1;
	}

	public void put(int key, int value) {
		if(map.containsKey(key)) remove(map.get(key));
		if(map.size() == cap) remove(head.next);
		add(new Node(key, value));
	}
	public void remove(Node node){
		map.remove(node.key);
		node.pre.next = node.next;
		node.next.pre = node.pre;
	}
	public void add(Node node){
		map.put(node.key, node);
		Node p = tail.pre;
		node.next = tail;
		tail.pre = node;
		node.pre = p;
		p.next = node;
	}
}
