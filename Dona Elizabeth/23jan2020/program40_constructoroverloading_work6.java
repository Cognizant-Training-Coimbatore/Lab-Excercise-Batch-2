class constr_overl
{
	constr_overl()
	{
		System.out.println("Unknown");
	}
	constr_overl(String str)
	{
		System.out.println(str);
	}
}
public class program40_constructoroverloading_work6 {

	public static void main(String[] args) {
		constr_overl obj=new constr_overl();
		constr_overl obj1=new constr_overl("Parvathy sethu"); 
	}

}
