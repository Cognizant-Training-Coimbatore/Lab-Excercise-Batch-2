import java.util.ArrayList;

public class qstn_2801_06 {

	public static void main(String[] args) {

		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Yellow");		
		System.out.println("Size of list\t:\t"+colors.size());
		System.out.println("ArrayList is dynamic. We can add elements to the array dynamically.(Just by using add().");
		colors.add("Gray");
		System.out.println("Size of updated list\t:\t"+colors.size());

	}

}
