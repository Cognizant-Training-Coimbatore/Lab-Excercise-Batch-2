package package2;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int count=0;
		System.out.println("Enter the string");
		
	    String inputString = "aryan";
	    char[] inputarray=inputString.toCharArray();
	    for(i=0;i<inputString.length();i++) {
	    if(inputarray[i] =='a'||inputarray[i] =='e'||inputarray[i] =='i'|| inputarray[i] =='o'||inputarray[i] =='u')
	    {
	    	count++;
	    }}
System.out.println(count);
	}

}
