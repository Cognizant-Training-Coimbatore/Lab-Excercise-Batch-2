import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_color {

	public static void main(String[] args)
	{
		ArrayList<String> ob=new ArrayList<String>();
		System.out.println("The colors are:");
		ob.add("red");
		ob.add("blue");
		ob.add("white");
		ob.add("yellow");
		ob.add("pink");
		System.out.println(ob);
		
		Iterator iterator1=ob.iterator();
		System.out.println("All elements are:");
		while(iterator1.hasNext())
		{
			Object o=iterator1.next();
			System.out.println(o);
		}

		
		

	}

}
