class sam
{
	static int i;
	void display()
	{
		i++;
		System.out.println(i);
	}
}
public class prog_static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        sam obj1= new sam();
        sam obj2= new sam();
        obj1.display();
        obj2.display();
	}

}
