import java.util.Random;
import java.util.Scanner;

public class Q9_random_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
Random r=new Random();
System.out.println("Enter limit");
int n=sc.nextInt();
int i;
for(i=0;i<n;i++)
{
System.out.println("Random numbers"+r.nextInt(100));
	}

}
}