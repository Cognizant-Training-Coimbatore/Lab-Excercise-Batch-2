import java.util.ArrayList;

public class question3_add_first_arraylist {

	public static void main(String[] args) {
		ArrayList<String>  numbers = new ArrayList<String>();
		
		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Four");
		numbers.add("Five");
		
		numbers.add(0,"Zero");
		
		for(String s: numbers)
		{
			System.out.println("number= " +s);
		}

	}

}
