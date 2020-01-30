class staticvar
{
	static int i=0;
	void display()
	{
		i++;
		System.out.println(i);
	
	}
}
public class program64_lab16_staticvar {

	public static void main(String[] args) {
		staticvar obj=new staticvar();
		obj.display();
		
	}

}
