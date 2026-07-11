import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int[] initial_numbers = {10,11,12,13,14,15,16,17,18,19};

        for (int i = 1; i < initial_numbers.length; i++) {
            numbers.add(initial_numbers[i]);
        }

        numbers.add(sc.nextInt());

        numbers.add(0, sc.nextInt());

        numbers.remove(6);

       numbers.set(0,9);

        System.out.println(numbers);
    }
}
