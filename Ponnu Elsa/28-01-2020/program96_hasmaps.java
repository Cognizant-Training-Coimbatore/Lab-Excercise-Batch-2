import java.util.HashMap;
import java.util.Scanner;

public class program96_hasmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashmap1 = new HashMap<Integer,String>();
		hashmap1.put(1, "java");
		hashmap1.put(2, "c");
		hashmap1.put(3, "c++");
		hashmap1.put(4, "css");
		hashmap1.put(5, ".net");
		hashmap1.put(6, "python");
		int opt;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the option between 1-6:");
		opt=scanner.nextInt();
		String coursename = hashmap1.get(opt);
		System.out.println(coursename);
		hashmap1.remove(5);
	}

}
