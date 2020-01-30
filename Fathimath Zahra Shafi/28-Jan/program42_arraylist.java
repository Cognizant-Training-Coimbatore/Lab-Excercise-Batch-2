import java.util.ArrayList;

public class program42_arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(100);
		list1.add(90);
		list1.add(6);
		list1.add(44);
		
		System.out.println(list1.contains(200));
	}

}
