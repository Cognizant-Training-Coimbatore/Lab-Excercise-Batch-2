class sam
{
	 static int i;
	void display()
	{
		i++;
		System.out.println(i);
	}
}
public class prog34_static {

	public static void main(String[] args) {
		sam obj1= new sam();
		obj1.display();
		sam obj2= new sam();
		obj2.display();
		

	}

}
