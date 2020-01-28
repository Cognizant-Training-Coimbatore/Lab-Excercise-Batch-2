class student12
{
	String str;
	String str1;
	int roll_no;
	String ph_no;
}
public class class_example2 {

	public static void main(String[] args) {
		student12 obj=new student12();
		obj.str="sam";
		obj.str1="house no 24 kochi 88890";
		obj.roll_no=20;
		obj.ph_no="566767890";
		student12 obj1=new student12();
		obj1.str="john";
		obj1.str1="house no 24 kannur 88890";
		obj1.roll_no=21;
		obj1.ph_no="780900908";
		System.out.println("Name: "+obj.str +"\n"+"Address: " +obj.str1 +"\n"+"roll_no:" +obj.roll_no+"\n"+"ph_no:"+obj.ph_no);
		System.out.println("");
		System.out.println("Name: "+obj1.str +"\n"+"Address: " +obj1.str1 +"\n"+"roll_no:" +obj1.roll_no+"\n"+"ph_no:"+obj1.ph_no);
		
		

	}

}
