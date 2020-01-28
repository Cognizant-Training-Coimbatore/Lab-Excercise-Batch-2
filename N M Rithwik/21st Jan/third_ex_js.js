function combine()
{	
	var s1=" ",s2=" ";
	var n;
	s1=prompt("enter first string");
	n=s1.length;
	while(n>=0)
	{
		s2=s2+s1.charAt(n);
		n--;
	}
	document.write(s2);
}
 