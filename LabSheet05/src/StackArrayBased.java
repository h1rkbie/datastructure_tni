public class StackArrayBased {
	 private int[] stacks; // array to store elements
	 private final int MAX_STACK = 50; // maximum size of stack
	 private int tops; // index of the top element
	
	// create an empty stack with a maximum size
	 public StackArrayBased() {
	 stacks = new int[MAX_STACK];
	 tops = -1;
	 }
	 
	 // create an empty stack with a specific size
	 public StackArrayBased(int capacity) {
	 stacks = new int[capacity];
	 tops = -1;
	 
	 }
	 
	 public boolean isEmpty() {
		 return tops == -1;
	 }
	 
	 public boolean isFull() {
		 return tops == stacks.length-1;
	 }
	 
	 public boolean push(int new_element) {
		 if (!isFull()) {
			 /*
			  * tops++;
			  * stacks[tops] = new_element;
			  */
			 stacks[++tops] = new_element;
			 return true;
		 }
		 return false;
	 }
	 
	 public int peek() {
		 if (!isEmpty()) {
			 return stacks[tops];
		 } else {
			 return -1;
//			 return -9999; //For atypical case;
		 }
	 }
	 
	 public int pop() {
		 if (!isEmpty()) {
//			 int last_element = stacks[tops--];
//			 tops--;
			 return stacks[tops--];
		 }
		 return -1;
	 }
	 
	 public void popAll() {
		 stacks = new int[MAX_STACK];
		 tops = -1; 
	 }
	 
	 
	 
	
}
