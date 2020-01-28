import java.util.ArrayList;
import java.util.Scanner;

public class qstn_2801_05 {

	public static void main(String[] args) {

		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Yellow");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("position to update\t:\t");
		int a=sc.nextInt();
		System.out.print("color to change\t:\t");
		String str=sc.next();
		colors.add(a,str);
		System.out.println(colors);
	}

}
