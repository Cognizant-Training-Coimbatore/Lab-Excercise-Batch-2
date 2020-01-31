
public class pgm_9 {

	public static void main(String[] args) {
		int i,num;
		int c;
		int s=0;
		for(num=1;num<=100;num++)
		{
			c=0;
			for(i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					c++;
					break;
				}
				
			}
			if(c==0&&num!=1)
			{
				s=s+num;
			}
			
		}
		System.out.println("sum:" +s);
	}
}
		