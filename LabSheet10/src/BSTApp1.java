public class BSTApp1 {
	public static void main(String[] args) {
		BinarySearchTree Tree1 = new BinarySearchTree();

		Tree1.sampleTree1();
		Tree1.printTree(Tree1.getRoot(), 0);

		System.out.println("\nMinimum Node is " + Tree1.findMiniMum().data);
		System.out.println("Maximum Node is " + Tree1.findMaximum(Tree1.getRoot()).data);
		
		int findNum = 15;
		System.out.println("Is " + findNum + " in BST => " + Tree1.findSpecificData(findNum));

		int delNode = 60;
		Tree1.searchDeleteNode(delNode);
		System.out.println("Parent = " + Tree1.getParent().data);
		System.out.println("Delete Node is " + Tree1.getDeleteNode().data);
		System.out.println();
		
		Tree1.delete(delNode);
		Tree1.printTree(Tree1.getRoot(), 0);
	}
}
