import java.util.Scanner;

public class oddoreve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the 5 numbers");
		Scanner soc =new Scanner(System.in);
		int n,count=0;
		n=soc.nextInt();
		if(n%2==0)
		{count+=1;}
		n=soc.nextInt();
		if(n%2==0)
		{count+=1;}n=soc.nextInt();
		if(n%2==0)
		{count+=1;}n=soc.nextInt();
		if(n%2==0)
		{count+=1;}n=soc.nextInt();
		if(n%2==0)
		{count+=1;}
		System.out.println("number of even numbers :"+count);
		System.out.println("number of odd numbers :"+(5-count));
	}

}
