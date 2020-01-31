package jan31;

class a2
{
	double result;
	float w=25.5f;
	float x=3.5f;
	float y=40.5f;
	float z=4.5f;
	
	
	void display()
	{
		result=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(result);
	}
}
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a2  obj=new a2();
		obj.display();
		

	}

}
