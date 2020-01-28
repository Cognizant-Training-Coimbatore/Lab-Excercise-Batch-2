import java.util.ArrayList;
public class question2_iterate_arraylist {

	public static void main(String[] args) {
		System.out.println("\nUsing Iterator");
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cheetah");
		animals.add("Elephant");
		animals.add("Whale");
		
		for(String s:animals)
		{
		System.out.println(s);
		}

	}

}
