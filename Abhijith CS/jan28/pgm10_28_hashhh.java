package collections;

import java.util.HashMap;
import java.util.Scanner;

public class pgm10_28_hashhh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1,"Java");
		map1.put(2,"Selenium");
		map1.put(3,"C++");
		int opt;
		System.out.println(map1);
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter your option between 1 to 3");
		opt=sc.nextInt();
		String crs=map1.get(opt);
		System.out.println(crs);
		map1.remove(opt);
		System.out.println(map1);
	}

}
