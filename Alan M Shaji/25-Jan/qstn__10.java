import java.util.Scanner;

public class qstn__10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ar[]= new int[5];
		System.out.println("enter numbers");
		for(int i=0;i<5;i++)
			ar[i]=sc.nextInt();
		int max,min;
		max=min=ar[0];
		for(int i=1;i<5;i++)
		{
			if(max<ar[i])
				max=ar[i];
			if(min>ar[i])
				min=ar[i];
		}
		System.out.println("max\t:\t"+max+"\nmin\t:\t"+min);
		sc.close();

	}

}
