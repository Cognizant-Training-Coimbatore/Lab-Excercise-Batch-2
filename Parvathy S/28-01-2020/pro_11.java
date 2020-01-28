import java.util.ArrayList;
import java.util.Iterator;


public class pro_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
