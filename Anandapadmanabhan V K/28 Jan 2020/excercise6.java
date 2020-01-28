import java.util.ArrayList;
import java.util.List;



public class excercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer>mylist=new ArrayList<Integer>();
			mylist.add(100);
			mylist.add(200);
			mylist.add(300);
			mylist.add(400);
			System.out.println("Size of string before adding elements " + mylist.size());
			mylist.add(500);
			mylist.add(600);
			System.out.println("Size of string after adding elements " + mylist.size());
	}

}
