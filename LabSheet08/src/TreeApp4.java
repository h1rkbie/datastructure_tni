import java.util.Scanner;

public class TreeApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree Tree = new BinaryTree();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------");
		System.out.println("Binary Tree From CreateTree6()");
		System.out.println("-------------------------------");
		
		Tree.createTree6();
		Tree.printTree(Tree.getRoot(), 0);
		
		System.out.println("-------------------------------");
		System.out.print("Input Number : ");
		int numsTarget = sc.nextInt();
		
		Tree.searchDeleteNode(numsTarget);
		Node found = Tree.getSearch();
		
		
		if (found != null) {
			if (found.left != null) {
			System.out.println("Left Child : " + found.left.data);
		} else {
			System.out.println("No left Child");
		}
		
		if (found.right != null) {
			System.out.println("Right Child : " + found.right.data);
		} else {
			System.out.println("No Right Child");
		}
		
		if (found.left == null && found.right == null) {
			System.out.println("[" + found.data + "] is Leaf Node");
		} else {
			System.out.println("[" + found.data + "] is not Leaf Node");
		}
	} else {
		System.out.println("Cannot found Node (data = [" + numsTarget + "])");
	}
		System.out.println("-------------------------------");
	}
	
	}


