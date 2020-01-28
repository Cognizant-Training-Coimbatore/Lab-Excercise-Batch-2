import java.util.ArrayList;
import java.util.List;

public class Q3_insert_element {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(0,3);
		for(int i:l1)
		{
			System.out.println(i);
		}
		

	}

}
