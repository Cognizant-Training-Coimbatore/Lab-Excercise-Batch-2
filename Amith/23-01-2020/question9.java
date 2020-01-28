class print
{
	print(int a,char c)
	{
		System.out.println(a+","+c);
	}
	print(char c,int a)
	{
		System.out.println(c+","+a);
	}
	
}
public class question9 {

	public static void main(String[] args) 
	{
	print obj= new print(2,'e');
	print obj1= new print('e',2);
	}

}
