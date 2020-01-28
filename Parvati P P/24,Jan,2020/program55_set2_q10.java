package Package2;

public class program55_set2_q10 {

	public static void main(String[] args) {
		int i;
		String inputName="parvati";
		String reverseName="";
		char[] inputArray=inputName.toCharArray();
		for(i=inputName.length()-1;i>=0;i--)
		{
			reverseName=reverseName+inputName.charAt(i);
		}
		 if(reverseName.equals(inputName))
		{
			System.out.println("String is palindrome..");
		}
		 else
		 {
			 System.out.println("String is not palindrome..");
		 }
	}

}
