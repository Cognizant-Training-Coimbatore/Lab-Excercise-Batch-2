import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		
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
		System.out.println("sum is  " +sum);
		System.out.print("avg is  ");
		System.out.println(sum/count);

}
}