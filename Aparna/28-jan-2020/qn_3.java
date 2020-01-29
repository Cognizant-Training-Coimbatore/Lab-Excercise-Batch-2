package set_6;

import java.util.HashMap;
import java.util.Scanner;

public class qn_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> app=new HashMap<Integer,String>();
		
		String opt;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter value ");
		opt=scanner.nextLine();
		app.put(1, opt);
		System.out.println(app);
		
		
	}

}
