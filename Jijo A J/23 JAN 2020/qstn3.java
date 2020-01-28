import java.util.Scanner;

class Area
{
	int area ,length1,breadth;
	int returnArea(int length1 , int breadth)
	{
		area =length1*breadth;
		return area;
		
	}
	
	}
public class qstn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the length and breadth");
Scanner sc=new Scanner(System.in);
int length2=sc.nextInt();
int breadth2=sc.nextInt();
Area aa=new Area();
int area=aa.returnArea(length2,breadth2);
System.out.println("AREA :"+area);
	}

}
