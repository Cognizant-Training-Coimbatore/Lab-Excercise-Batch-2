class samplecode
{
	static int i;
	void display()
	{
		i++;
		System.out.println(i);
	}
}
public class pgm65_statc_var_methods_call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		samplecode obj=new samplecode();
		obj.display();
		samplecode obj1=new samplecode();
		obj1.display();
	}

}
