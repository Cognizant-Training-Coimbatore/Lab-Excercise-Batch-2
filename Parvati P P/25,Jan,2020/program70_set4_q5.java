package Package2;

import java.util.Scanner;

public class program70_set4_q5 {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		String inputArray[] = new String[5];
		System.out.println("Enter 5 names..");
		for(i=0;i<5;i++)
		{
			inputArray[i]=sc.nextLine();
		}
System.out.println("Printing in upper case..");
for (i = 0; i < 5; i++) {
   System.out.print("My friend " + (i+1) + " : "+inputArray[i].toUpperCase() + "\n");
}
	}}
