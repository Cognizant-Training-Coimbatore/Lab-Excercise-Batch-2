package Exercise;

class myException extends Exception
{
	myException(String S)
	{
		super(S);
	}
}

public class Q07_customExceptions {
	
		static void validate(int empcode) throws myException
		{
			if(!(empcode > 101 && empcode <200))
				throw new myException("Invalid Employee Code");
			else
				throw new myException("Valid Employee Code");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				validate(13);
				validate(190);
			}
			catch(Exception m)
			{
				System.out.println("Exception occured " + m);
			}
		}
}
