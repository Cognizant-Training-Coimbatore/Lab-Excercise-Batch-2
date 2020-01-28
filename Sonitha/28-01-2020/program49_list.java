import java.util.ArrayList;
import java.util.List;

public class program49_list {

	public static void main(String[] args) 
	{
		List<String> a1 = new ArrayList<String>();
		a1.add("amit");
		a1.add("Vijay");//will attain 2nd position
		a1.add("Kumar");
		a1.add(1,"Sachin");//will attain 1st position
		a1.add("Raju");
		System.out.println("An element at 2nd position : "+ a1.get(2));
		for(String s:a1) //it will print from first to the last 
		{	
			System.out.println(s);
		}
	}

}
