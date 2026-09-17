public class TreeApp2 {
	public static void main(String[] args) {
		BinaryTree tree4 = new BinaryTree();
		BinaryTree tree5 = new BinaryTree();
		BinaryTree tree6 = new BinaryTree();
		
		System.out.println("-------------------------------");
		System.out.println("Binary Tree From CreateTree4()");
		System.out.println("-------------------------------");
		
		tree4.createTree4();
		tree4.printTree(tree4.getRoot(), 0);
		
		System.out.println("-------------------------------");
		System.out.println("Binary Tree From CreateTree5()");
		System.out.println("-------------------------------");
		
		tree5.createTree5();
		tree5.printTree(tree5.getRoot(),0);
		
		System.out.println("-------------------------------");
		System.out.println("Binary Tree From CreateTree6()");
		System.out.println("-------------------------------");
		
		tree6.createTree6();
		tree6.printTree(tree6.getRoot(),0);
		
		
	}
}
