import java.util.ArrayList;
import java.util.List;

public class diff_forloop {

	public static void main(String[] args) 
	{
		List<String> a1 = new ArrayList<String>();
		a1.add("amit");
		a1.add("raj");
		a1.add("dam");
		System.out.println(a1.get(2));
		for(String s:a1)
		{
			System.out.println(s);
		}
	}

}
