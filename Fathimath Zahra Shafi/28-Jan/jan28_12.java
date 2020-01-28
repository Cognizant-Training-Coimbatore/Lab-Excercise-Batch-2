import java.util.HashSet;
import java.util.Set;

public class jan28_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> myset1=new HashSet<Integer>();
		myset1.add(10);
		myset1.add(20);
		myset1.add(30);
		myset1.add(40);
		System.out.println("set 1: ");
		System.out.println(myset1);
		
		Set<Integer> myset2=new HashSet<Integer>();
		myset2.add(11);
		myset2.add(10);
		myset2.add(30);
		myset2.add(20);
		System.out.println("set 2:");
		System.out.println(myset2);
		myset1.retainAll(myset2);
    System.out.println("common elements: " +myset1);

	}

}
