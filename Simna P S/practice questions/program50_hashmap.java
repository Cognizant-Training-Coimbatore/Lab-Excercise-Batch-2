import java.util.HashMap;
import java.util.Scanner;

public class program50_hashmap 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hashmap1 = new HashMap<Integer,String>();
		hashmap1.put(1, "java");
		hashmap1.put(2, "selenium");
		hashmap1.put(3, "c++");
		hashmap1.put(4, "ada");
		hashmap1.put(5, "pearl");
		hashmap1.put(6, "cobol");
		int opt;
		System.out.println("enter an option");
		Scanner sc = new Scanner(System.in);
		opt = sc.nextInt();
		String coursename = hashmap1.get(opt);
		System.out.println(coursename);
		hashmap1.remove(5);

	}

}
