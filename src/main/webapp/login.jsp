<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
  <script>
  
      
     function  add(num1,num2){
    	 return num1+num2;
     }
     
     let result=add(12,23);
     console.log(result);
     
     //Anonymous function
     
     var eat = function(num1,num2) {
    	               return num1+num2; 
                 };
      console.log(eat);           
      console.info(eat(10,40));
      
      //Fat Arrow Function
      var gee = (num1,num2)=>num1+num2;
      console.log(gee);           
      console.info(gee(10,40));
    //undefined -- primitive type which takes only one value which is undefined
    //boolean is data type which takes only two values which is true or false
     let name=undefined;
     console.log(name);
     if(name===undefined){
    	 console.log("Ahahah");
     }
     
     console.log(typeof name); //undefined
     if(!name){
    	console.log("Name = "+name); 
     }
     
     let pk =100; 
     console.log(typeof pk); //number
     let pname=null;
     console.log(typeof null); //null -- object
     if(pname===name){
    	 console.log("pname==name"+(pname==name));
     }else{
    	 console.log("Kakaka  = ");
     }
	
     let obj={};  //in JavaScript object is combination of key and values
     console.log(obj);
     obj.name="Nagendra";
     obj.email="nagen@gmail.com";
     console.log(obj);
     
     class  Customer {
    	 constructor(name,email,ssn) {
    		//this={}; 
		    this.name=name;
		    this.email=email;
		    this.ssn=ssn;
		 }
    	 
    	 info() {
    		 console.log("name = "+this.name);
    		 console.log("email = "+this.email);
    		 console.log("ssn = "+this.ssn);
    	 }
     }
     
     //es6
     let customer =new Customer("Nagendra","nagen@gmail.com","022-229-222");
     customer.info();
     
     
  </script>
  
  
</head>
<body>
   <header style="background-color: yellow;height: 30px;">
   </header>

   <div  class="container">
     <h2>Login Page   - >>> Email  -  ${applicationScope.email} <br/>, mobile - >>> ${applicationScope.mobile}</h2>
     <img  src="students_schoool_footer2.png"  style="height: 180px;"/>
       <img  src="students_schoool_footer2.png"  style="height: 180px;"/>
       <img  src="students_schoool_footer2.png"  style="height: 180px;"/>  
         <h1 style="color: red;font-weight: bold;">${message}</h1>
         
         <form action="auth" method="post">
         <div class="form-group" style="width: 60%">
            <label>Username</label>
            <input type="text" name="username" class="form-control">
         </div>
         
       <div class="form-group" style="width: 60%">
            <label>Password</label>
            <input type="password" name="password" class="form-control">
         </div>
         
           <div class="form-group" style="width: 60%">
         	  <button type="submit" class="btn btn-primary">Login</button>
              <button type="reset" class="btn btn-danger">Clear</button>
              
               <a href="signups">
              		 <button type="button" class="btn btn-warning">Data</button>
               </a>
               
                 <a href="csignup">
              		 <button type="button" class="btn btn-primary">SignUp</button>
               </a>
         </div>
         </form>
   </div>

</body>
</html>