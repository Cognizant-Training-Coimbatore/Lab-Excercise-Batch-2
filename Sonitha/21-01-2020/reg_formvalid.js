function Reg_FormValidation()
{
	
	var mobileno=document.getElementById('mobileno');
	var emailaddress= document.getElementById('emailaddress');
	

//Checking each input in the order as it appears in the form

	if(inputmobileno(mobileno, ,10,"*Enter only indian mobileno")){
		if(inputemail(emailaddress,"*must be a gmail account")){
		//	if(inputgender(Gender,"*mandatory field")){
			//	if(inputhobbies(Hobbies,"*mandatory field")){
				//	if(inputqualification(Qualification,"*mandatory field")){
					//	if(inputusername(username,"*Enter a valid username")){
							//if(inputpassword(password,"*Enter a valid password")){
								//if(inputaboutyourself(AboutYourself,"*only alphabets are allowed ,minimum 100 characters")){
//
									return true;
								}
							}
						//}
					//}
				//}
			//}
		//}
	//}
//}
return false;
}



//1.Lowercase letters should automatically converted to uppercase letters



//2.1.The country code should only allow Indian(+91)

//2.2.Mobile number length must be having 10 digits 

//3.it should only accept gmail

//4.gender field mandatory

//5.hobbies field mandatory

//6.qualification field mandatory

//7.username

//8.password 

//9.minimum 100 characters ,only alphabets are allowed
