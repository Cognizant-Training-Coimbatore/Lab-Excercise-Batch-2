function validateform(){  
var name=document.myform.name.value;    
 var username=document.myform.username.value; 
if (name==null || name==""){  
  alert("Name can't be blank");  
  return false;  
}
  else if (username==null || username="") {
  	alert("username cant be blank");
 	return false;
  }
}  