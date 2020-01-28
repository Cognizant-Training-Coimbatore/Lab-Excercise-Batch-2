import java.util.HashSet;
import java.util.Set;

public class date28_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myset1=new HashSet<String>();
		Set<String> myset2=new HashSet<String>();
		myset1.add("four");
		myset1.add("two");
		myset1.add("eight");
		myset1.add("one");
		myset1.add("three");
		System.out.println("Elements in first set are"+myset1);
		myset2.add("nine");
		myset2.add("seven");
		myset2.add("three");
		myset2.add("one");
		System.out.println("Elements in second set are"+myset2);
		myset1.retainAll(myset2);
		System.out.println("elements same on both sets are "+myset1);
	}

}
