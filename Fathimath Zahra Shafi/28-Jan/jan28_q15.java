import java.util.TreeSet;

public class jan28_q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> myset1=new TreeSet<Integer>();
		myset1.add(8);
		myset1.add(90);
		myset1.add(1);
		myset1.add(2);
		myset1.add(4);
		
		System.out.println(myset1);
		System.out.println("numbers strictly greater than or equal to 5: " +myset1.ceiling(5));

	}

}
