
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String line = "This website is aw3som3.";
		        int vowels = 0;
		        line = line.toLowerCase();
		        for(int i = 0; i < line.length(); ++i)
		        {
		            char ch = line.charAt(i);
		            if(ch == 'a' || ch == 'e' || ch == 'i'
		                || ch == 'o' || ch == 'u' ) {
		                ++vowels;
		            }
		           
		        }
		        System.out.println("No of vowels is : " +vowels);
	}

}
