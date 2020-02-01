package Project;

public class pgm31_q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1, a=2,sum=0;
		while(count<=100)
		{
			int i=1,c=0;
			while(i<=a)
			{
				if(a%i==0)
			     c++;
			i++;
		    }
			
			if(c==2)
			{
				sum+=a;
				count++;
				//System.out.println(a);
				
			}
			a++;
			
		}System.out.println("Sum:"+sum);
	}
}

