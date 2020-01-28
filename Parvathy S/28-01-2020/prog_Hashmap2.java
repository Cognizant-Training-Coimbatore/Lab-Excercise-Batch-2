import java.util.HashMap;
import java.util.Scanner;

public class prog_Hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashmap1 = new HashMap<Integer,String>();
		hashmap1.put(1, "Java");
		hashmap1.put(2, "C#");
		hashmap1.put(3, "Selenium");
		hashmap1.put(4, "Perl");
		hashmap1.put(5, "Cobol");
		int opt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your optionbetween 1 to 5");
		opt =sc.nextInt();
		String coursename = hashmap1.get(opt);
		System.out.println(coursename);
		hashmap1.remove(5);

	}

}
