import java.util.HashMap;
import java.util.Scanner;

public class p86_hashmap {


	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(1,"one");
		m.put(2,"two");
		m.put(3,"three");
		m.put(4,"four");
		System.out.println(m);
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option");
		opt=sc.nextInt();
		String coursename=m.get(opt);
		System.out.println(coursename);
		m.remove(5);
		
	}	

}
