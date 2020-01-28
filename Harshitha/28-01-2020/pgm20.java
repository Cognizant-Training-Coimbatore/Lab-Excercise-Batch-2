import java.util.ArrayList;

public class pgm20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li=new ArrayList<String>();
		li.add("Red");
		li.add("Green");
		li.add("Yellow");
		li.add("Blue");
		System.out.println("Total items"+li.size());
		System.out.println("Testing if item 2 exist"+li.contains("Green"));
		System.out.println("Printing all items"+li);
		System.out.println("Removing item 3");
		li.remove("Yellow");
		System.out.println("Printing all items after removal"+li);
	}

}
