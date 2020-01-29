import java.util.TreeSet;

public class lab13 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		TreeSet<String> ts1=new TreeSet<String>();
		ts.add("Java");
		ts.add("selenium");
		ts.add("c++");
		ts.add("perl");
		ts.add("unix");
		ts.add("Java");
		ts.add("ada");
		ts1.add("cobol");
		ts1.add("ios");
		System.out.println("TreeSet1: "+ts);
		System.out.println("TreeSet2: "+ts1);
		ts1.addAll(ts);
		System.out.println("After concatenation TreeSet2: "+ts1);
	}

}
