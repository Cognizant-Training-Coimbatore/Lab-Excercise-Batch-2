import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int sum=0,count=0;
		while(true) {
			int a= sc.nextInt();
			if(a==-999)
			{
				break;
			}
			else
			{
				sum=sum+a;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/count);

}
}