import java.util.*;

public class p100_update 
{

	public static void main(String[] args)
	{
		List<String> map1=new ArrayList<String>();
		map1.add("one");
		map1.add("two");
		map1.add("three");
		map1.add("four");
		System.out.println("The elements are:"+map1);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index to update");
		int n=sc.nextInt();
		map1.set(n-1,"THREE");
		System.out.println("The updated elements are:"+map1);
	}

}
