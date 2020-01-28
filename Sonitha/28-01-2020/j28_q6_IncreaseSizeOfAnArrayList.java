import java.util.ArrayList;

public class j28_q6_IncreaseSizeOfAnArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
		System.out.println(numbers);
		numbers.add(4);
		numbers.add(5);
		numbers.ensureCapacity(5);
		System.out.println(numbers);

	}

}
