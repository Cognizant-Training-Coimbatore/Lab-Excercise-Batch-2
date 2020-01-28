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
public class program42_question9 {

	public static void main(String[] args) 
	{
	print obj= new print(2,'p');
	print obj1= new print('p',2);
	}

}