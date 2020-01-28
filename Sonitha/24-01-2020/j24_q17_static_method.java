import java.util.Scanner;

class stat2{
	static int i;
	static void prt1(int a) {
		i=a;
	}
	static void prt2() {
		System.out.println(i);
		i++;
	}
	
}
public class j24_q17_static_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    stat2 ob = new stat2();
    stat2 ob1 = new stat2();
    stat2 ob2 = new stat2();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value for the static variable : ");
    int value = sc.nextInt();
    ob.prt1(value);
    ob.prt2();
    ob1.prt2();
    ob2.prt2();
    
    
	}

}
