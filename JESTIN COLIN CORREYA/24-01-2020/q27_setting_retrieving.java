package demo;

import java.util.Scanner;

class col
{
	static String name;
	col()
	{
		name="";
	}
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		col.name = name;
	}
}
public class q27_setting_retrieving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter string:  ");
String q=s.nextLine();
col.setName(q);
System.out.println(col.getName());


	}

}
