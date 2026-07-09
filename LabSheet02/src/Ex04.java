
public class Ex04 {

	public static void main(String[] args) {
		
		NumberArrayController numbers = new NumberArrayController();
		numbers.Display("Display an initial dataset:");
		
		int[] new_nums = new int[numbers.getNums().length-1];
		
		//Copy data from nums -> new_nums start index - 1
		for (int i = 0; i < new_nums.length; i++) {
			new_nums[i] = numbers.getNums()[i+1];
		}
		
		//Display Result
		numbers.setNums(new_nums);
		numbers.Display("\n\nAfter deleted the first element:");

	}

}
