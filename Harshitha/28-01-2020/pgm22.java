import java.util.HashMap;
import java.util.Scanner;

public class pgm22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "Venki");
		map1.put(2, "Ravi");
		map1.put(3, "jikki");
		map1.put(4, "Amul");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option b/w 1 to 4");
		int i=sc.nextInt();
		String emp=map1.get(i);
		System.out.println(emp);
		map1.remove(2);
		System.out.println(map1);
	}

}
