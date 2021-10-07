package com.bridgelabz.bst;
class MyNode {
	int data;
	MyNode left;
	MyNode right;

	public MyNode(int data) {
		this.data = data;
		MyNode left = null;
		MyNode right = null;
	}

	@Override
	public String toString() {
		return "MyNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}

public class Bst {
	int size = 0;

	public MyNode insert(MyNode node,int data) {
		
		if (node == null) {
			node = createNewNode(data);
		}
		
		if(data < node.data) {
			node.left = insert(node.left, data);
		}else if(data > node.data) {
			node.right = insert(node.right, data);
		}  
		return node;
	}

	private MyNode createNewNode(int data) {
		MyNode mynode = new MyNode(data);
		size += 1;
		return mynode;
	}

	public void printInorder(MyNode node) {
		if(node == null) {
			return;
		}
		printInorder(node.left);
		System.out.print(node.data + "->");
		printInorder(node.right);
		
	}
	public int size() {
		return size;
	}
	
	
}
