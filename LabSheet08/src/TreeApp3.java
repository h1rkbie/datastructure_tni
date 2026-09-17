
public class TreeApp3 {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		System.out.println("-------------------------------");
		System.out.println("Binary Tree From CreateTree1()");
		System.out.println("-------------------------------");
		
		tree.createTree5();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("-------------------------------");
		System.out.println("Delete Leaf Node");
		System.out.println("-------------------------------");
		
		int target = 25;
		tree.delete(target);
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("\nLeaf Node Target is = " + tree.getDeleteNode().data);	
		
		System.out.println("\n-------------------------------");
		System.out.println("Delete 1 Child Node");
		System.out.println("-------------------------------");
		
		int ChildTarget = 10;
		tree.delete(ChildTarget);
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("\n1 Child Node Target is = " + tree.getDeleteNode().data);	

		System.out.println("\n-------------------------------");
		System.out.println("Delete 2 Child Node");
		System.out.println("-------------------------------");
		
		int TWOChildTarget = 60;
		tree.delete(TWOChildTarget);
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("\n2 Child Node Target is = " + tree.getDeleteNode().data);	
		
		

		
		

	}
	

}
