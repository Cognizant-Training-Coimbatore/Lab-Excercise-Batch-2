import java.util.Scanner;

class pgm
{
	pgm()
	{
		System.out.println("I love pgmming language");
	}
	pgm(String str)
	{
		System.out.println("I  love "+str);
	}
}
public class pgm37_pgminglnguage {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int flag;
		System.out.println("Do you want to enter any pgmming language? yes-1/no-0");
		flag= sc.nextInt();
		if(flag==0)
		{
			pgm sn = new pgm();
		}
		else
		{
			System.out.println("Enter a pgmming language: ");
			name = sc.nextLine();
			pgm sn1 = new pgm(name);
		}
		sc.close();
	}

}
