import java.lang.Math;
import java.util.Scanner;
public class qstn3 {
public static void areaHex(double x)
	{
		double area=6*x*x/(4*Math.tan(3.14/6));
		System.out.println(area);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner xx=new Scanner(System.in);
System.out.println("Enter the side : ");
double xxx=xx.nextDouble();
areaHex(xxx);
	}

}
