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
    //function definition with out name
    let add = function(num1,num2){
    	  return num1+num2;
    };
    
    let ue=add(12,3);
     result=ajax(10,20,add);
    //Here we are passing function definition
    //as a parater
    result=ajax(10,20,function(num1,num2){
    	  return num1+num2;
    });
    
    result=ajax(10,20,function(num1,num2){
  	       return num1*num2;
      });
    
     result=ajax(10,20,(num1,num2)=>num1+num2);
  
    console.log(result);
    
    //Named function
    //this function is taking three parameters
    function ajax(x,y,callback){
    	return callback(x,y);
    }
     
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