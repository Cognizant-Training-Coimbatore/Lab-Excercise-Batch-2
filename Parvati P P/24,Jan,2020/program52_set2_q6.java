import java.util.Scanner;

public class program52_set2_q6 {

	public static void main(String[] args) {
		float num = 0,sum=0,avg=0;
		int count=0;
		Scanner sc=new Scanner(System.in);
      System.out.println("Enter the integers and press -999 to stop");
		while((num=sc.nextInt())!=-999)
		{
			sum=sum+num;
			count++;
		}
		avg=sum/count;
		System.out.println("The sum is "+sum+"The average is "+avg);
	}

}
