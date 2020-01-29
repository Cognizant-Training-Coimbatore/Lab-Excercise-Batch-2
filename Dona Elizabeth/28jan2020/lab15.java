import java.util.TreeSet;

public class lab15 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(2);
		ts.add(4);
		ts.add(10);
		ts.add(3);
		ts.add(8);
		System.out.println("Number greater than 5 :"+ts.higher(5));
		
	}

}
