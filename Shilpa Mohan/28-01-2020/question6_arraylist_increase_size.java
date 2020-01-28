import java.util.ArrayList;

public class question6_arraylist_increase_size {

	public static void main(String[] args) {
	 ArrayList<Integer> num = new ArrayList<Integer>(5);
	 num.add(1);
	 num.add(2);
	 num.add(3);
	 num.add(4);
	 num.add(5);
	 
	 System.out.println("Original array: " +num);
	 
	 num.ensureCapacity(6);
	 num.add(10);
	 num.add(20);
	 num.add(30);
	 num.add(40);
	 num.add(50);
	 num.add(60);
	 
	 System.out.println("New array: " +num);

	}

}
