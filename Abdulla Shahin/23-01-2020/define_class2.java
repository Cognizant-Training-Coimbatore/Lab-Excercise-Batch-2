class sample
{
	int x,y;
}
public class define_class2 {

	public static void main(String[] args) {
		sample obj = new sample();
		int result;
		obj.x=10;
		obj.y=5;
		result=obj.x+obj.y;
		System.out.println(result);
	}

}
