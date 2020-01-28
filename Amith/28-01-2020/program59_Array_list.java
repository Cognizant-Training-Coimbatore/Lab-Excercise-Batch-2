import java.util.ArrayList;
import java.util.List;

public class program59_Array_list {

	public static void main(String[] args) 
	{
		List<String>a1=new ArrayList<String>();
		a1.add("amith");
		a1.add("suresh");
		a1.add("mahesh");
		a1.add("jinesh");
		System.out.println("element at second position is "+a1.get(1));
		for(String s:a1)
		{
			System.out.println(s);
		}

	}

}
