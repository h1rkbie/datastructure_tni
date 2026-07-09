
public class Ex03 {

	public static void main(String[] args) {
		
		NumberArrayController numbers = new NumberArrayController();
		numbers.Display("Display an initial dataset:");
		
		int[] new_nums = new int[numbers.getNums().length + 1 ];
		
		// copy elements from nums to new_nums;
		for (int i = 0; i < numbers.getNums().length; i++) {
			new_nums[i] = numbers.getNums()[i];
		}
		
		numbers.setNums(new_nums);
		numbers.Display("\n\nAfter copy elements:");
		
		new_nums[new_nums.length - 1] = 15;
		
		numbers.setNums(new_nums);
		numbers.Display("\n\nAfter adding new_element:");
		
	}

}
