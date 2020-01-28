import java.util.ArrayList;

public class prog112_updatearray_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>map1=new ArrayList<Integer>();
		
		map1.add(1);
		map1.add( 2);
		map1.add( 3);
		map1.add( 4);
		
		System.out.println(map1);
		map1.set(2,4);
		System.out.println("after updating");
		System.out.println(map1);
	}

}
