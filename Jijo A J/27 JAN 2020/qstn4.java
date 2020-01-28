import java.util.Scanner;

public class qstn4 {
	static void validate(String s)throws NullPointerException
	{
		if(s.length()==0)
		{System.out.println("String cant be null");}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		
		 try {     int a[]=new int[5];     
		 a[5]=m;
		 System.out.println(a[6]/0);   }     
		 catch(ArithmeticException e)   {   System.out.println("Arithmetic Exception occurs");    }     
		 catch(ArrayIndexOutOfBoundsException e)   {   System.out.println("ArrayIndexOutOfBounds Exception occurs");   }     
		  finally {             
			  System.out.println(m/1); }
	}

}