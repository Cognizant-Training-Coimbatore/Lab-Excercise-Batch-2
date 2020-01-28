import java.util.TreeSet;

public class pgm28_q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("Apple");
		ts1.add("Orange");
		ts1.add("Mango");
		ts1.add("Grapes");
		ts1.add("Banana");
		System.out.println("First Set:"+ts1);
		TreeSet<String> ts2=new TreeSet<String>();
		ts2.add("Watermelon");
		ts2.add("Orange");
		ts2.add("Mango");
		ts2.add("Guava");
		ts2.add("Banana");
		System.out.println("Second Set:"+ts2);
		ts1.addAll(ts2);
		System.out.println(ts1);
	}

}
