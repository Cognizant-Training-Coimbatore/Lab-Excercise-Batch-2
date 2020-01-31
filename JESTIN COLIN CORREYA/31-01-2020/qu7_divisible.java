package java50;

public class qu7_divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("the numbers divisible by 3:");
for(int i=1;i<100;i++)
{
	if(i%3==0)
	{
		System.out.println(i);
	}
}
System.out.println("numbers divisible by 11:");
for(int i=1;i<100;i++)
{
	if(i%11==0)
	{
		System.out.println(i);
	}
}
System.out.println("numbers divisible by both 3 and 11:");
for(int i=1;i<100;i++)
{
	if((i%3==0)&&(i%11==0))
	{
		System.out.println(i);
	}
}
	}

}
