
public class program38_myexceptions
	{
		static void validate(int age)throws program37_myexception
		{
			if(age<18)
				throw new program37_myexception("not valid");
			else
				System.out.println("welcome to vote");
		}
     public static void main(String[] args) 
     {
    	 try
    	 {
    		 validate(13);
    	 }
    	 catch(Exception m)
    	 {
    		 System.out.println("exception occured"+m);
    	 }
		

	}

}
