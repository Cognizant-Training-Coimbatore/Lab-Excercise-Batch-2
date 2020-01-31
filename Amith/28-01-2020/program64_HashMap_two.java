import java.util.HashMap;
import java.util.Scanner;

public class program64_HashMap_two {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(1, "amith");
		hashmap1.put(2, "jaseem");
		hashmap1.put(3, "arhem");
		hashmap1.put(4, "raju");
		hashmap1.put(5, "sudha");
		hashmap1.put(6, "ramesh");
		hashmap1.put(7, "suresh");
		int op;
		System.out.println("enter option between 1 n 7");
		Scanner sc= new Scanner(System.in);
		op=sc.nextInt();
		String coursename=hashmap1.get(op);
		System.out.println((coursename));
		hashmap1.remove(4);
		System.out.println(hashmap1);
	}

}
