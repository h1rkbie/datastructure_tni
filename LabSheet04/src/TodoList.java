public class TodoList
{
	public static void main(String[] arg)
	{
		DoublyLinkedList todoList = new DoublyLinkedList();
		todoList.insert("Finish Homework");
		todoList.insert("Laundry");
		todoList.insert("Group Meeting");
		
		System.out.println("To-Do List = " + todoList.traversal());
		
		todoList.insert(0, "Submit Report");
		System.out.println("To-Do List = " + todoList.traversal());
		
		todoList.insert(2, "Buy Food");
		
		todoList.insert("Go to Gym");
		System.out.println("To-Do List = " + todoList.traversal());
		
		todoList.remove();
		System.out.println("To-Do List = " + todoList.traversal());
		
		todoList.remove(3);
		System.out.println("To-Do List = " + todoList.traversal());
		
		System.out.println("Backward Treversal = " + todoList.backwardTraversal());

		
	}
	
}
