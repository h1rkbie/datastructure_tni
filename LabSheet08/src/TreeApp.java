public class TreeApp {
	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		System.out.println("Binary Tree From CreateTree1()");
		System.out.println("-------------------------------");
		
		BinaryTree Tree = new BinaryTree();

		Tree.createTree1();
		Tree.printTree(Tree.getRoot(), 0);
		
		System.out.println("-------------------------------");
		System.out.println("Binary Tree From CreateTree2()");
		System.out.println("-------------------------------");
		
		Tree.createTree2();
		Tree.printTree(Tree.getRoot(), 0);
		
		System.out.println("-------------------------------");
		System.out.println("Binary Tree From CreateTree3()");
		System.out.println("-------------------------------");
		
		Tree.createTree3();
		Tree.printTree(Tree.getRoot(),0);
		
	}
}
