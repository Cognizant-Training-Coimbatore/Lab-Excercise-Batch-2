
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class program112q19 {
static void current(Map<Integer,String> keys)
{
Set<Integer> keys1 = keys.keySet();
int a=0,b=0;
for(int x:keys1) {
if(a<x)
{
a=x;
}
if(a>x)
{
b=x;
}

}
System.out.println(a);
System.out.println(b);

}


public static void main(String[] args) {
// TODO Auto-generated method stub
HashMap<Integer,String> mymap = new HashMap<Integer,String>();
mymap.put(2, "do");
mymap.put(0, "re");
mymap.put(4, "mi");
mymap.put(3, "fo");

current(mymap);
}
}


