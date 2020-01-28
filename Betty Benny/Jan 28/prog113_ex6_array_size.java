import java.util.ArrayList;
import java.util.List;
public class prog113_ex6_array_size {

	public static void main(String[] args) 
	{
		List<String> mylist = new ArrayList<String>();
		mylist.add("violet");
		mylist.add("Green");
		mylist.add("Orange");
		mylist.add("White");
		mylist.add("Blue");
		System.out.println(mylist);
		
		((ArrayList<String>) mylist).ensureCapacity(7);
		mylist.add("pink");
		mylist.add("Blue");
		System.out.println(mylist);

	}

}
