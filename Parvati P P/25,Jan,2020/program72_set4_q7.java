package Package2;

import java.util.Scanner;

public class program72_set4_q7 {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		int inputArray[]=new int[5];
		int copyArray[]=new int[5];
		System.out.println("Enter values..");
	    for(i=0;i<5;i++)
	    {
	    	inputArray[i]=sc.nextInt();
	    }
	    System.out.println("Elements of copied array are..");
	    for(i=0;i<5;i++)
	    {
	    	copyArray[i]=inputArray[i];
	    	System.out.println(copyArray[i]);
	    }

	}

}
