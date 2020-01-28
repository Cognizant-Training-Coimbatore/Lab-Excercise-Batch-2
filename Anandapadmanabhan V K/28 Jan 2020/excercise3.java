import java.util.ArrayList;

public class excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>List1=new ArrayList<String>();
		List1.add("Red");
		List1.add("yellow");
		List1.add("white");
		List1.add("blue");
		System.out.println("First list " + List1);
		List1.add(0,"black");
		System.out.println("Second list " + List1);
	}

}