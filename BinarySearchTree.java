package binarysearchtree;

public class BinarySearchTree {

	public static void main(String[] args) {

		givenNumberWhenAddedToBSTShouldReturnSize3();
	}

	public static void givenNumberWhenAddedToBSTShouldReturnSize3() {
		BinaryTree<Integer> myBinaryTree = new BinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		Integer size = myBinaryTree.getSize();
		System.out.println("Size of Binary Tree is " + size);
		boolean result = size.equals(3);
		System.out.println(result);
	}
}
