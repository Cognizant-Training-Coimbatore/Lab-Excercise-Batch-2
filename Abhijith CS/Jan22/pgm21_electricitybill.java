import java.util.Scanner;

public class pgm21_electricitybill {

	public static void main(String[] args) {
		int unit,pr,cur;
		int b;
		double bill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  previous unit of electricity used :");
		pr = sc.nextInt();
		System.out.println("Enter current unit of electricity used :");
		cur = sc.nextInt();
		unit = cur-pr;
		if (unit<=100)
		{
			System.out.println("Eligible for free usage");
		}
		else if (unit>100 && unit<=200)
		{
			b= unit-100;
			bill = b;
			System.out.println("Electricity bill is :"+bill);
		}
		else if (unit>200 && unit<=300)
		{
			b = unit-200;
			bill = 100+(b*2);
			System.out.println("Electricity bill is :"+bill);
		}
		else if (unit>300 && unit<=400)
		{
			b = unit-300;
			bill = 100+(100*2)+b*3;
			System.out.println("Electricity bill is :"+bill);
		}
		else if (unit>400)
		{
			b = unit-400;
			bill = 100+(100*2)+(100*3)+(b*4);
			bill = bill +(bill*0.1);
			System.out.println("Electricity bill is :"+bill);
		}
		sc.close();
	}

}
