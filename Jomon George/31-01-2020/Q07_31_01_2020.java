package Exercise;

public class Q07_31_01_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=99;i++)
		{
			if(((i%3==0) && (i%11==0)) || (i%33==0))
				System.out.println(i);
		}
	}

}
