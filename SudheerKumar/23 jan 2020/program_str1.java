class str2
{
	String s1="java";
	String s2="application";
	void addTwoStr()
	{
		System.out.println(s1.concat(s2));
	}
		void lower()
		{
		System.out.println(s1.toLowerCase());
		}
		void vowel()
		{
			int count=0;
			for(int i=0;i<s2.length();i++)
			{
				char c=s2.charAt(i);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					count++;
				}
			}
			System.out.println(count);
	}
}

public class program_str1 {

	public static void main(String[] args) {
		str2 obj=new str2();
		obj.addTwoStr();
		obj.lower();
		obj.vowel();
		// TODO Auto-generated method stub

	}

}
