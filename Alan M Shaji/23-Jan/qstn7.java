import java.util.Scanner;

class AddAmount
{
	double amount=50;
	AddAmount() {
		// TODO Auto-generated constructor stub
		System.out.println("Initial Piggie bank\t:\t$"+amount);
	}
	AddAmount(double addON)
	{
		amount+=addON;
	}
	
}
public class qstn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddAmount obj=new AddAmount();
		Scanner sc= new Scanner(System.in);
		System.out.print("Add money\t:\t$");
		double l=sc.nextDouble();
		AddAmount obj1=new AddAmount(l);
		System.out.println("Updated Piggie bank\t:\t$"+obj1.amount);
		sc.close();

	}

}
