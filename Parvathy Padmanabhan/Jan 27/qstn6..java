import java.util.Scanner;

public class qstn6 {
	static void validate(String s)throws NullPointerException
	{
		if(s.length()==0)
		{System.out.println("String cant be null");}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the nString");
		Scanner sc =new Scanner(System.in);
		String m=sc.nextLine();
		
		try{  validate(m);
		      }
		catch(Exception e){System.out.println(e);}
		
	}

}