import java.util.ArrayList;

public class jan28_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("blue");
		list1.add("red");
		list1.add("black");
		list1.add("orange");
		
		System.out.println("size of array list before updating " +list1.size());
		((ArrayList<String>) list1).ensureCapacity(6);
		list1.add("yellow");
		list1.add("green");
		System.out.println("size of array list after updating " +list1.size());

	}

}
