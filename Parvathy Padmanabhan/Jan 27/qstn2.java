import java.util.Scanner;

public class qstn2 {
	static void validate(int number1,int number2)throws myexceptions
	{
		if(number2==0)
		{System.out.println("Second number cant be zero");}
		else {System.out.println(number1+"/"+number2+" = "+number1/number2);}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers");
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		try{  validate(m,n);
		      }
		catch(Exception e){System.out.println(e);}
		
	}

}