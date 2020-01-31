import java.util.ArrayList;
import java.util.List;

public class program45_diff_for_loop 
{

	public static void main(String[] args) 
	{
		List<String> a1 = new ArrayList<String>();
		a1.add("simna");
		a1.add("sru");
		a1.add("gay");
		a1.add("1,sim");
		System.out.println("an element at the second position: "+a1.get(2));
		for(String s:a1)
		{
			System.out.println(s);
		}

	}

}
