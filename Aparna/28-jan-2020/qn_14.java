package set_6;

import java.util.Iterator;
import java.util.TreeSet;

public class qn_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer>tree=new TreeSet<Integer>();
tree.add(1);
tree.add(2);
tree.add(3);
tree.add(4);
tree.add(5);
tree.add(6);
tree.add(7);
tree.add(8);
System.out.println(tree);
TreeSet<Integer>tree1=new TreeSet<Integer>();
tree1=(TreeSet)tree.headSet(7);
Iterator iterator;
iterator = tree1.iterator();
System.out.println("Tree set data: ");     
while (iterator.hasNext()){
System.out.println(iterator.next() + " ");


	}

}}
