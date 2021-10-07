package com.bridgelabz.bst;

public class BstMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bst tree = new Bst();
		MyNode root = null;
		root = tree.insert(root,56);
		root = tree.insert(root,30);
		root = tree.insert(root,70);

		tree.printInorder(root);
		System.out.println(root);
	}


}


