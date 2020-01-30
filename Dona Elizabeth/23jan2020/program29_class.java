class sample
{
	int x,y;
}

public class program29_class {

	public static void main(String[] args) {
		sample obj=new sample();
		int result;
		obj.x=10;// without using method
		obj.y=12;
		result=obj.x+obj.y;
		System.out.println(result);
	}

}
