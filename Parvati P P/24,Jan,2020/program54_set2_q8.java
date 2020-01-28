package Package2;

public class program54_set2_q8 {

	public static void main(String[] args) {
		int i,count=0;
		String inputString="parvati";
		char[] inputArray=inputString.toCharArray();
		for(i=0;i<inputString.length();i++)
		{
			if(inputArray[i]=='a'||inputArray[i]== 'e'||inputArray[i]== 'i'||inputArray[i]== 'o'||inputArray[i]== 'u')
				count++;
		}
		System.out.println(count);
		
	}

}
