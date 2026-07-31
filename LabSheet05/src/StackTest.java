
public class StackTest {

	public static void main(String[] args)
	{
		StackArrayBased stacks = new StackArrayBased();
		
		stacks.push(10);
		stacks.push(20);
		stacks.push(30);
		
		System.out.println(stacks.peek());
		System.out.println(stacks.pop());
		System.out.println(stacks.peek());
		System.out.println(stacks.pop());
		System.out.println(stacks.peek());
	}

}
