import java.util.Scanner;

public class j25_q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) 
		{
		System.out.println("Enter the name");
		str[i]=sc.next();
		
		}
		for(int i=0;i<5;i++) {
			System.out.println("\n"+ str[i].toUpperCase());
		}
	}

}
