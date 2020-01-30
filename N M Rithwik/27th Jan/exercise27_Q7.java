
public class exercise27_Q7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n>101 && n<200)
		{
			System.out.println("input is valid");
		}
		else
		{
			throw new ArithmeticException("SORRY INVALID INPUT");
		}
	}

}
