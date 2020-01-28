
function jsfn(num1,num2)
{
	/*var num1=Number(prompt("Enter first number: "));
	var num2=Number(prompt("Enter second number: "));*/
	var num1=document.getElementById("num1").value;
	var num2=document.getElementById("num2").value;

	var c=Number(num1)+Number(num2);
	//document.write(num1.typeOf());
	//document.write(num2.typeOf());
	document.write(c);	
}