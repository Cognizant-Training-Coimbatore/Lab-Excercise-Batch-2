class sample
{
	int x,y;
}
public class program29_class_object_accessing 
{

	public static void main(String[] args) 
	{
		sample obj = new sample();
		obj.x =10;
		obj.y = 10;
		int result;
		result=obj.x+obj.y;
		System.out.println(result);

	}

}
