<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Add Employee</title>
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
     <h2>Employee Page</h2>
     <img  src="students_schoool_footer2.png"  style="height: 180px;"/>
        <img  src="students_schoool_footer2.png"  style="height: 180px;"/>
          <img  src="students_schoool_footer2.png"  style="height: 180px;"/>
         
         <h1 style="color: red;font-weight: bold;">${message}</h1>
         <form action="addEmployee" method="post">
         <div class="form-group" style="width: 60%">
            <label>Name</label>
            <input type="text"  name="name" class="form-control">
         </div>
         
           
       <div class="form-group" style="width: 60%">
            <label>Email</label>
            <input type="email" name="email" class="form-control">
         </div>
         
           <div class="form-group" style="width: 60%">
            <label>Age</label>
            <input type="number"  name="age" class="form-control">
         </div>
         
          <hr/>
           <div class="form-group" style="width: 60%">
			 	 <button type="submit" class="btn btn-primary">Add Employee</button>
              <button type="reset" class="btn btn-danger">Clear</button>
         </div>
         </form>
   </div>

</body>
</html>