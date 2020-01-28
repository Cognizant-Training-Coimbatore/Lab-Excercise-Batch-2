import java.util.Scanner;

public class exc7 {
	static void validate(int s)throws myexceptions
	{
		if(s<101||s>200)
		{System.out.println("Input Rejected");}
		else {System.out.println("Input accepted");}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		
		try{  validate(m);
		      }
		catch(Exception e){System.out.println(e);}
		
	}

}