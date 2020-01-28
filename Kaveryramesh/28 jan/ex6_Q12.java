package demo;

import java.util.HashSet;
import java.util.Set;

public class ex6_Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Set<String> s1 =new HashSet<String>();
          Set<String> s2 =new HashSet<String>();
          s1.add("white");
          s1.add("black");
          s1.add("pink");
          s1.add("green");
          s2.add("blue");
          s2.add("pink");
          s2.add("black");
          s1.retainAll(s2);
          System.out.println(s1);
          
	}

}
