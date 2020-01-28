import java.util.TreeSet;

public class jan28_q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> myset1=new TreeSet<String>();
		myset1.add("java");
		myset1.add("selenium");
		myset1.add("c++");
		myset1.add("perl");
		myset1.add("unix");
		System.out.println("treeset 1: " +myset1);
		
		TreeSet<String> myset2=new TreeSet<String>();
		myset2.add("python");
		myset2.add("ruby");
		System.out.println("treeset 2: " +myset2);
		
		myset1.addAll(myset2);
		System.out.println("combined treeset: "+myset1);
		
	}

}
