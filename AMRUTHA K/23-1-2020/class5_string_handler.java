package demo;

import java.util.Scanner;

class stringhandler{
	String x;

	void input() {
		System.out.println("enter a string:");
		Scanner a=new Scanner(System.in);
		String b=a.nextLine();
		x=b.toLowerCase();
	
	}
	void display() {
		System.out.println("stringlower="+x+"  length="+(x.length()));
	}
	
}
public class class5_string_handler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringhandler obj=new stringhandler();
		obj.input();
		obj.display();

	}

}
