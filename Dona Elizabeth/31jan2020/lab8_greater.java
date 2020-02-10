import java.util.Scanner;

public class lab8_greater {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter three numbers : ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x<y&&y<z)
		{
			System.out.println("True");
		}
	}

}
