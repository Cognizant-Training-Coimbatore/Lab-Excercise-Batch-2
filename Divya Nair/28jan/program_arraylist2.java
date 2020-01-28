import java.util.ArrayList;
import java.util.List;

public class program_arraylist2 {

	public static void main(String[] args)
	{
		List<String> al=new ArrayList<String>();
		al.add("Kavya");
		al.add("Diya");
		al.add("Divya");
		al.add(1,"Navya");
		System.out.println("An element in the secon position is:" +al.get(2));
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
