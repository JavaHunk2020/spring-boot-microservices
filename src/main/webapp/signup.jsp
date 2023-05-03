<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Signup</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
   <header style="background-color: yellow;height: 30px;">
   </header>

   <div  class="container">
     <h2>Signup Page</h2>
     <img  src="students_schoool_footer2.png"  style="height: 180px;"/>
        <img  src="students_schoool_footer2.png"  style="height: 180px;"/>
          <img  src="students_schoool_footer2.png"  style="height: 180px;"/>
         
         <h1 style="color: red;font-weight: bold;">${message}</h1>
         <form action="csignup" method="post">
         <input type="hidden" name="cid" value="${signupDTO.cid}">
         <div class="form-group" style="width: 60%">
            <label>Username</label>
            <input type="text" value="${signupDTO.username}" name="username" class="form-control">
         </div>
         
       <div class="form-group" style="width: 60%">
            <label>Password</label>
            <input type="password" value="${signupDTO.password}" name="password" class="form-control">
         </div>
         
           
       <div class="form-group" style="width: 60%">
            <label>Email</label>
            <input type="email" value="${signupDTO.email}" name="email" class="form-control">
         </div>
         
           <div class="form-group" style="width: 60%">
            <label>Mobile</label>
            <input type="number" value="${signupDTO.mobile}" name="mobile" class="form-control">
         </div>
         
            <div class="form-group" style="width: 60%">
            <label>Address</label>
            <textarea rows="3" name="address" class="form-control">${signupDTO.address}</textarea> 
            
         </div>
         
         
           <div class="form-group" style="width: 60%">
         	  <c:if test="${signupDTO==null}">
			 	 <button type="submit" class="btn btn-primary">Signup</button>
			 </c:if>
         	 <c:if test="${signupDTO!=null}">
	         	  <button type="submit" class="btn btn-primary">Update</button>
         	  </c:if>
         	  
              <button type="reset" class="btn btn-danger">Clear</button>
              
                <a href="login.jsp">
              		 <button type="button" class="btn btn-primary">Login</button>
               </a>
         </div>
         </form>
   </div>

</body>
</html>