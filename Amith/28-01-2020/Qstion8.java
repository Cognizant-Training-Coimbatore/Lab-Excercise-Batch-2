import java.util.ArrayList;
import java.util.List;

public class Qstion8 {

	public static void main(String[] args) 
	{
		List<String>a1=new ArrayList<String>();
		a1.add("amith");
		a1.add("suresh");
		a1.add("mahesh");
		a1.add("jinesh");
		
		System.out.println("the elemennts in the array are :" );
		for(int i=0;i<4;i++)
		{
			System.out.println(a1.get(i));
		}

	}

}
