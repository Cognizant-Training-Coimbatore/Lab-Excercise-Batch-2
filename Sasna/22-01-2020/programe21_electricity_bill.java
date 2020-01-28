import java.util.Scanner;

public class programe21_electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double old_meter, new_meter, unit;
		System.out.println("enter the old meter reading");
		Scanner sc = new Scanner(System.in);
		old_meter = sc.nextInt();
		System.out.println("enter the old meter reading");
		new_meter = sc.nextInt();
		
		unit = new_meter - old_meter;
		if(unit >=1 && unit <=100) {
			System.out.println("free");
		}
			else if(unit >=101 && unit <=200) {
			System.out.println(unit*1);
		}
			else if(unit >=201 && unit <=300) {
			System.out.println(unit*2);
			}
			else if(unit >=301 && unit <=400) {
			System.out.println(unit*3);
			}
			else {
				double amount=unit*4;
			System.out.println(amount + (amount*10/100));
				}
					
			
		
	}

}
