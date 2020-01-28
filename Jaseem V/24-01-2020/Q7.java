class test3
{
	static int x;
static void setting()
{
x=6;	
}
static int retrive()
{
return x;	
}

}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
test3 obj=new test3();
obj.setting();
int a=obj.retrive();
System.out.println(a);
	}

}