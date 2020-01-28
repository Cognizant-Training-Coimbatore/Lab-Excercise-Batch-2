import java.util.ArrayList;
import java.util.HashMap;
public class prog112_ex5_specific_array {

	public static void main(String[] args)
	{
ArrayList<Integer>map1=new ArrayList<Integer>();
		
		map1.add(1);
		map1.add( 2);
		map1.add( 3);
		map1.add( 4);
		
		System.out.println(map1);
		map1.set(2,4);
		System.out.println("after updating array is:");
		System.out.println(map1);
	}

}
