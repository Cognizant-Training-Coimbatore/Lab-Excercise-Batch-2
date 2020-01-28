import java.util.ArrayList;
import java.util.List;

public class Replace_arraylist {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stubList;
		 	List<String> top5Books = new ArrayList<String>();
		    top5Books.add("Clean Code");
		    top5Books.add("Clean Coder");
		    top5Books.add("Effective Java");
		    top5Books.add("Head First Java");
		    top5Books.add("Head First Design patterns");

		   
		    System.out.println("ArrayList before replace: " + top5Books);

		    top5Books.set(1, "Introductoin to Algorithms");

		    System.out.println("ArrayList after replace: " + top5Books);

	}

}
