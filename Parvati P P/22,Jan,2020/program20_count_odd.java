import java.util.Scanner;

public class program20_count_odd {

	public static void main(String[] args) {
		int num,count1=0,i,count2=0,rem;
		int inputArray[]= new int[20];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the count");
	count1=sc.nextInt();
	System.out.println("Enter the nos.");
	for(i=0; i<count1;i++)
	{
		inputArray[i]=sc.nextInt();
	}
	for(i=0; i<count1;i++)
	{
		rem=inputArray[i]%2;
		if(rem==1)
		{
			count2=count2+1;
		}
	  }
		
			
	
	
	System.out.println("The count of odd no.s is"+count2);
	
	}

}
