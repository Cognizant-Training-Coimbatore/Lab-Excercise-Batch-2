import java.util.Scanner;

class Area1
{
	int area ,length1,breadth;
	int returnArea(int length1 , int breadth)
	{
		area =length1*breadth;
		return area;
		
	}
	int returnArea(int length1)
	{
		area =length1*length1;
		return area;
		
	}
	
	}
public class qstn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the length and breadth");
Scanner sc=new Scanner(System.in);
int length2=sc.nextInt();
int breadth2=sc.nextInt();
Area1 aa=new Area1();
int area=aa.returnArea(length2,breadth2);
System.out.println("RECTANGLE AREA :"+area);
area=aa.returnArea(length2);
System.out.println("SQUARE AREA :"+area);
	}

}
