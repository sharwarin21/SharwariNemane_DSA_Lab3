package com.gl.main;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of nodes:");
		int num = scan.nextInt();
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("Enter the elements:");
		for (int i = 0; i < num; i++)
			bst.insertData(scan.nextInt());
		bst.displayBST();
		System.out.println("Enter sum to find pair:");
		int sum = scan.nextInt();
		FindPairImpl.findPairOfNodes(bst, sum);
		scan.close();
	}
}
