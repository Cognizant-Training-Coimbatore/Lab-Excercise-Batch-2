import java.util.TreeSet;

public class strictly_greater {

	public static void main(String[] args)
	{
		TreeSet<Integer> hsh1=new TreeSet<Integer>();
		
		hsh1.add(1);
		hsh1.add(100);
		hsh1.add(8);
		hsh1.add(98);
		hsh1.add(8);
		System.out.println("The first set of elements are:"+hsh1);
		System.out.println("The number greater than or equal to 80:"+hsh1.ceiling(80));
		

	}

}
