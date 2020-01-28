package Tuesday;

import java.util.Scanner;
import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hashmap1=new HashMap<Integer,String>();
		hashmap1.put(1,"java");
		hashmap1.put(2,"irfan");
		hashmap1.put(3,"abhi");
		hashmap1.put(4,"stan");
		hashmap1.put(5,"vish");
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter option between 1 to 5");
		a=scan.nextInt();
		String b=hashmap1.get(a);
		System.out.println(b);
		hashmap1.remove(5);
		System.out.println(hashmap1);
	}

}
