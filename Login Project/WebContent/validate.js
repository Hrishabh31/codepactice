function A() {
	
	//document is object of DOM (document object model).
	var a=document.getElementById("x");
	var name=document.forms["form"]["uname"].value; //applicable to name
	var pass=document.form.pword.value; //applicable to name
	
	/*document.write("hjk");
	console.log("fghj");*/
	//window.print();
	
	if(name==""){
		document.getElementById("x").style.display="inline-block"; //exception can also be handled in java script.
		return false;
	}
	
	if(name!=""){
		document.getElementById("x").style.display="none";		
	}
	
	if(pass.length<5){
		document.getElementById("y").style.display="inline-block";
		return false;
	}
	
	return true;
}