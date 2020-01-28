import java.util.ArrayList;

public class jan28_q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("blue");
		list1.add("red");
		list1.add("black");
		list1.add("orange");
		System.out.println("array list before updating" +list1);
		list1.set(1,"yellow");
		System.out.println("array list after updating" +list1);

	}

}
