import java.util.HashMap;
import java.util.Scanner;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "anandu");
		map1.put(2,"shahin");
		map1.put(3, "jim");
		map1.put(4, "kane");
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your option between 1 to 4");
		opt=sc.nextInt();
		String empname=map1.get(opt);
		System.out.println(empname);
	}

}
