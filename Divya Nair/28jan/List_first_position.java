import java.util.ArrayList;
import java.util.List;

public class List_first_position {

	public static void main(String[] args)
	{
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(23);
		list1.add(40);
		list1.add(50);
		list1.add(63);
		System.out.println("The elements are:");
		System.out.println(list1);
		list1.add(0,10);
		System.out.println("The updated position:");
		System.out.println(list1);
		
		

	}

}
