import java.util.TreeSet;

public class jan28_q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> myset1=new TreeSet<Integer>();
		myset1.add(8);
		myset1.add(90);
		myset1.add(1);
		myset1.add(2);
		myset1.add(5);
		System.out.println(myset1);
		System.out.println("numbers less than 7: ");
		for(int x:myset1)
		{
			if(x<7)
			{
				System.out.println(x);
			}
		}

	}

}
