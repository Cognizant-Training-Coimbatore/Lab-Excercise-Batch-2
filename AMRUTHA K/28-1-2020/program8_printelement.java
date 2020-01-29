package packagee;

import java.util.ArrayList;


public class program8_printelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>opp=new ArrayList<String>();
		opp.add( "ammu");
		opp.add("acha");
		opp.add( "ammma");
		System.out.println(opp);
		for(int i=0;i<3;i++) {
			System.out.println(i+"="+opp.get(i));
			
		}

	}

}
