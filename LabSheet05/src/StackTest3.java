import java.util.Stack;

public class StackTest3 {
	public static void main(String[] args) {
		// create a new stack
		Stack<Integer> stacks = new Stack<>();
		
		stacks.push(10);
		stacks.push(11);
		stacks.push(12);
		System.out.println(stacks);
		
		// Pop each elements from the stack
		while (!stacks.empty()) {
			System.out.println(stacks.pop());
		}
	}
}
