package Lec_39;

import java.util.*;

public class Hashmap_1demo {

	public class Node {
		String key;
		Integer val;
		Node next;

		public Node(String key, Integer val) {
			this.key = key;
			this.val = val;
		}
	}

	Node[] arr;

	public HashMap() {
		arr = new Node[4];
	}
	public HashMap(int n) {
		arr = new Node[n];
	}
	public int Hashfun (String key) {
		int bn = key.hashCode() % arr.length;
		if (bn<0) {
			bn += arr.length;
		}
		return bn;
	}

}
