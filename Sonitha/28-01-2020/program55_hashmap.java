import java.util.HashMap;
import java.util.Scanner;

public class program55_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "C++");
		hashmap.put(2, "Java");
		hashmap.put(3, "Selenium");
		hashmap.put(4, "Cobol");
		hashmap.put(5, "Perl");
		int op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your opinion between 1 to 5");
		op = sc.nextInt();
		String coursename = hashmap.get(op);
		System.out.println(coursename);

	hashmap.remove(5);
	}

}
