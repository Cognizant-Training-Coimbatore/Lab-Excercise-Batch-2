import java.util.ArrayList;
import java.util.Iterator;

public class lab2 {

	public static void main(String[] args) {
		ArrayList<String> pets=new ArrayList<String>();
		pets.add("cat");
		pets.add("dog");
		pets.add("birds");
		Iterator it=pets.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			System.out.println(obj);
		}
	}

}
