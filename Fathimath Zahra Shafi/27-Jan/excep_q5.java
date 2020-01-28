import java.util.Scanner;

public class excep_q5 {
	
	

	static void checkMark(int mark)
	{
		if(mark>=0)
		{
			System.out.println("mark is valid!");
		}
		else
		{
			throw new ArithmeticException("Invalid mark entered");
		}
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter mark");
		mark=scanner.nextInt();
		checkMark(mark);
		

	}

}
