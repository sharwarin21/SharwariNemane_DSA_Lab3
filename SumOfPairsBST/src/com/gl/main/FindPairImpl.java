package com.gl.main;

import java.util.HashSet;

public class FindPairImpl {
	public static void findPairOfNodes(BinarySearchTree bst, Integer sum) {
		HashSet<Integer> set = new HashSet<>();
		if (!findPairsLogic(bst.getRoot(), sum, set))
			System.out.println("No pair found for given sum of " + sum + "!");
	}

	public static boolean findPairsLogic(Node root, Integer sum, HashSet<Integer> set) {
		if (root == null)
			return false;
		if (findPairsLogic(root.getLeft(), sum, set))
			return true;
		if (set.contains(sum - root.getData())) {
			System.out.println(
					"Pair (" + (sum - root.getData()) + "," + root.getData() + ") produces sum of " + sum + "!");
			return true;
		} else
			set.add(root.getData());
		return findPairsLogic(root.getRight(), sum, set);
	}
}
