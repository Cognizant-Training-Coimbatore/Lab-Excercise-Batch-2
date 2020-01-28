import java.util.Scanner;

class qtn{
	int x=9,a,b,c;
	void bla() {
		
		
		System.out.println("Can u guess it? 3 attempt left");
		System.out.println("Enter value ");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		if(a==x) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Can u guess it? 2; attempt left");
			System.out.println("Enter value ");
			b=scanner.nextInt();
			if(b==x) {
				System.out.println("Correct");
			}
			else {
				System.out.println("Can u guess it? 1; attempt left");
				System.out.println("Enter value ");
				b=scanner.nextInt();
				
				if(c==x) {
					System.out.println("Correct");
				}
				else
					System.out.println("The number is : " +x);
			}
		}
	}
}
public class Questian4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		qtn obj=new qtn();
		obj.bla();

	}

}
