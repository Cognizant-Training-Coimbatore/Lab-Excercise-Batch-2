package pack2;
import pack1.class1_protected_var;

public class class1_subclassof_protected extends class1_protected_var {

	void display() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		
		class1_subclassof_protected obj=new class1_subclassof_protected();
		obj.display();
		
		
	}}


