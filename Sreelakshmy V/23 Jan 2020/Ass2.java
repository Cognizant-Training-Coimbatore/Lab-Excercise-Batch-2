import java.util.Scanner;

public class Ass2 {

	public static void main(String[] args) {
		int n,i,a;
	Scanner sc=new Scanner(System.in);
	  System.out.println("Enter any value between 1 and 9");
	  n=sc.nextInt();
	  if(n>1&&n<9)
	  {
		  for(i=1;i<=n;i++)
		  {
			  System.out.println(i*n);
		  }
	  }
	  else
	  {
		  System.out.println("Enter value between 1 and 9");
	  }
	}

}
