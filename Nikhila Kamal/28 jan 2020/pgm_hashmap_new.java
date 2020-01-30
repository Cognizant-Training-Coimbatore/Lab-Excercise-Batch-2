import java.util.HashMap;
import java.util.Scanner;

public class pgm_hashmap_new {

	public static void main(String[] args) {
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,"java");
		map1.put(2,"c++");
		map1.put(3, "html");
		map1.put(4,"css");
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your option between 1 and 4");
		opt=sc.nextInt();
		String course=map1.get(opt);
		System.out.println(course);
		map1.remove(4);
		map1.size();
		System.out.println();

	}

}
