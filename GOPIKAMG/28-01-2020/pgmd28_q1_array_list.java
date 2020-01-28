import java.util.ArrayList;
import java.util.List;

public class pgmd28_q1_array_list {

	public static void main(String[] args)
	{
		
			List<String> a1=new ArrayList<String>();
			a1.add("red");
			a1.add("blue");
			a1.add("violet");
			a1.add("black");
			a1.add("white");
			System.out.println("An element at 2nd position: "+a1.get(2));
			for(String s:a1)
			{
				System.out.println(s);
			}


	}

}
