import java.util.Scanner;

public class qst__05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name[]=new String[5];
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 5 friends Name-->");
		for(int i=0;i<5;i++)
			{
			Name[i]=sc.next();
			Name[i]=Name[i].toUpperCase();
			}
		System.out.println("In Upper Case");
		for(int i=0;i<5;i++)
			System.out.println(Name[i]);
		
		

	}

}
