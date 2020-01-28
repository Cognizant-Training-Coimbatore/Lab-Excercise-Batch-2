import java.util.ArrayList;
import java.util.List;

public class program51_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> mylist = new ArrayList<String>();
         mylist.add("Item1");
         mylist.add("Item2");
         mylist.add("Item3");
         mylist.add("Item4");
         mylist.add("Item5");
         mylist.add("Item6");
         System.out.println("Total Item: "+ mylist.size());
         System.out.println("Testing Item4 exist : "+ mylist.contains("Item4"));
         System.out.println("Removing Item3.......");
         mylist.remove("Item3");
         System.out.println("Printing after renmoving ...."+ mylist);
         System.out.println("Total items after removing...."+ mylist.size());
	}

}
