import java.util.LinkedList;

public class qtn12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();
        al.add("amit");
        al.add("anurag");
        al.add("sachin");
        al.add("sabu");
        al.add("manu");
        al.add("dev");
        LinkedList<String> al1=new LinkedList<String>();
        al1.add("amit");
        al1.add("anurag");
        al1.add("sagu");
        al1.add("raghu");
        al1.add("manu");
        al1.add("bla");
        LinkedList<String> al2=new LinkedList<String>();
        for(String e:al1){
        	if(al.contains(e)) {
        		al2.add(e);
        		 

        		}
        	}System.out.println(al2);
       
	}

}
