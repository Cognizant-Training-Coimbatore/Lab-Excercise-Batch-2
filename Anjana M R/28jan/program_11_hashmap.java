import java.util.HashMap;
import java.util.Scanner;

public class program_11_hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(1,"java");
		hashmap1.put(2,"c#");
		hashmap1.put(3,"Selenium");
		hashmap1.put(4,"perl");
		hashmap1.put(5,"cobol");
		hashmap1.put(5,"fortran");
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur option between 1 to 6");
		opt=sc.nextInt();
		String coursename=hashmap1.get(opt);
		System.out.println(coursename);
		hashmap1.remove(5);
	}

}
