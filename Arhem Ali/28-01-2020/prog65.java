import java.util.HashMap;
import java.util.Scanner;

public class prog65 {

	public static void main(String[] args) {
		HashMap<Integer,String> map1= new HashMap<Integer,String>();
		map1.put(1, "java");
		map1.put(2, "c#");
		map1.put(3, "Selenium");
		map1.put(4, "perl");
		map1.put(5,"cobol");
		map1.put(6, "fortan");
		int opt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter option btw 1 to 6");
		opt=sc.nextInt();
		String course=map1.get(opt);
		System.out.println(course);
		map1.remove(5);
		
		
	}

}
