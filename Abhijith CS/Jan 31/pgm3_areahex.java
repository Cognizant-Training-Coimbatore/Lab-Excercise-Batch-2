package exercise_jan31;
class area
{
	area(int s)
	{
		double  ar;
		double rad = Math.toRadians(30);
		double tan = Math.tan(rad);
		ar=(6*s*s)/(4*tan);
		System.out.println("Area of hexagon: "+ar);
	}
}
public class pgm3_areahex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area obj = new area(2);
	}

}
