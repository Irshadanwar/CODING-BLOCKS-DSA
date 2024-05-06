package Lec_37;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_level_Order {
	public class Node {
		int val;
		Node lifr;
		Node right;

	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Create_level_Order() {
		root = createTree();
	}

	private Node createTree() {
		Queue<Node> q = new LinkedList<>();
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item ;
		q.add(nn);
		while (!)
	}

}
