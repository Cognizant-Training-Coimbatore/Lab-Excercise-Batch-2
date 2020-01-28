import java.util.Scanner;

public class pgm4_25_namesarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the names: ");
		int i;
		for(i=0;i<5;i++)
		{
			name[i]=sc.nextLine();
			name[i]=name[i].toUpperCase();
		}
		System.out.println("The names are: ");
		for(i=0;i<5;i++)
		{
			System.out.println(name[i]);
		}
		sc.close();
	}

}
