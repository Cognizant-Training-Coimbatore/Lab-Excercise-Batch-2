import java.util.HashMap;
import java.util.Scanner;

public class prgmd28_practice_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(1, "Java");
		hashmap1.put(2, "c");
		hashmap1.put(3, "Python");
		hashmap1.put(4, "C#");
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter youtr option between 1 to 4");
		opt=sc.nextInt();
		String coursename=hashmap1.get(opt);
		System.out.println(coursename);
		hashmap1.remove(4);
		
		
	}

}
