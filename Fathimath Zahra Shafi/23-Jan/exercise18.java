class student2 {
	String name;
	
	student2(){
		System.out.println("name : unknown");
	}
	
	student2(String name){
		System.out.println("name : " +name);
	}
}
public class exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student2 obj=new student2();
		student2 obj1 = new student2("fathima");
		

	}

}
