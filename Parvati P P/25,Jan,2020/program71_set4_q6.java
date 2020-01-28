package Package2;

import java.util.Scanner;

public class program71_set4_q6 {

	public static void main(String[] args) {
		int i,count=0;
		float avg=0,sum=0;
	Scanner sc=new Scanner(System.in);
int inputArray[]=new int[5];
System.out.println("Enter 5 no.s...");
for(i=0;i<5;i++)
{
	inputArray[i]=sc.nextInt();
}
for(i=0;i<5;i++)
{
	sum=sum+inputArray[i];
	count++;
}
avg=sum/count;
System.out.println("The sum is.."+sum+" The average is.."+avg);
	}

}
