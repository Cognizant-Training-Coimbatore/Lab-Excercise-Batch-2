import java.util.Scanner;

public class qstn5 {
	static void validate(int number)throws myexceptions
	{
		if(number<=0)
		{System.out.println("Invalid marks");}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the marks");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		try{  validate(n);
		      }
		catch(Exception e){System.out.println(e);}
		
	}

}