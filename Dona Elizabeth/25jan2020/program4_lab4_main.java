package demo2;
import java.util.Scanner;

import demo1.program4_lab4;



public class program4_lab4_main {

	public static void main(String[] args) {
		String name;
		int age;
		//String pl;
		String desigtn;
		
		int salary;
		Scanner scc=new Scanner(System.in);
		program4_lab4 obj=new program4_lab4();
		System.out.println("Enter name,age,place,designation and salary of employee");
		name=scc.nextLine();
		age=scc.nextInt();
		pl=scc.nextLine();
		desigtn=scc.nextLine();
		System.out.println(name);
		System.out.println(age);
		//System.out.println(pl);
		System.out.println(desigtn);
		salary=scc.nextInt();
		obj.display(name,age,pl,desigtn,salary);
		scc.close();

	}

}
