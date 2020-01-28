import java.util.Scanner;

public class CountoddNos_test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		System.out.print("Enter 5 numbers-->");
		Scanner sc=new Scanner(System.in);
	/*	for(int i=0;i<5;i++) {
			int a=sc.nextInt();
			if(a%2!=0)
				count++;
		}	*/
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		if(a%2==0)
			count++;
		if(b%2==0)
			count++;
		if(c%2==0)
			count++;
		if(d%2==0)
			count++;
		if(e%2==0)
			count++;
		System.out.println("Count of odd no.s --> "+count);
		sc.close();

	}

}
