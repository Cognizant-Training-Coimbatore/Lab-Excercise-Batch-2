import java.util.HashMap;
import java.util.Scanner;

public class hash_map {

	public static void main(String[] args)
	{
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1,  "ram");
		map1.put(2,  "raj");
		map1.put(3,  "dam");
		map1.put(4,  "jam");
		int opt;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the option");
		opt = sc.nextInt();
		String empname = map1.get(opt);
		System.out.println(empname);
		

	}

}
