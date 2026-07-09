
public class Ex06 {

	public static void main(String[] args) {
		NumberArrayController numbers = new NumberArrayController();
		numbers.Display("Display an initial dataset:");
		
		int[] new_nums = new int[numbers.getNums().length - 1];
		int index_delete = 2;
		
		//Copy Data of first-half (0 - before index 2)
		for (int i = 0; i < index_delete; i++) {
			new_nums[i] = numbers.getNums()[i];
		}
		
		// Copy Data for end-half (after index 2 - last element)
		for (int i = index_delete +1; i < numbers.getNums().length; i++) {
			new_nums[i - 1] = numbers.getNums()[i];
		}
			
		// Display & Update Array
		numbers.setNums(new_nums);
		numbers.Display("\n\nAfter Deleted Data Index 2:");

	}

}
