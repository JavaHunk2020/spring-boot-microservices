    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  
  <script type="text/javascript">
          function deleteByAjax(username,itemId){
        	  //          <a href="dsignup?username=${item.username}">
			  //Ajax call 
        	  alert(username);
        	  window.fetch('http://localhost:8080/v2/dsignup/'+username, { method: 'DELETE' })
        	    .then(res=>res.json()).then(data=>{
        	    	//Hiding then row from front end
        	    	//$("#signup_"+itemId).hide();
        	    	//document.getElementById("signup_"+itemId)
        	    	 //Hiding element 
        	    	 document.getElementById("signup_"+itemId).style.display = 'none';
        	    });
          }
  
  </script>
  
</head>
<body>
   <header style="background-color: yellow;height: 30px;">
   </header>

   <div  class="container">
     <h2>Data Store</h2>
     <img  src="http://technohunk.biz/stutorial/img/jvm-architecture.png"  style="height: 180px;"/>
       <img  src="http://www.coddybug.com/action/dimage?imagePath=images/homeslider/students2.png"  style="height: 180px;"/>
         <img  src="http://technohunk.biz/stutorial/img/jvm-architecture.png"  style="height: 180px;"/>
         
          <p>Signups Data!</p>            
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Username</th>
        <th>Password</th>
        <th>Email</th>
        <th>DOE</th>
        <th>Salutation</th>
      </tr>
    </thead>
    <tbody>
    
     <c:forEach items="${sajana}" var="item">
      <tr id="signup_${item.cid}">
        <td>${item.username}</td>
        <td>${item.password}</td>
        <td>${item.email}</td>
        <td>${item.doe}</td>
         <td>
              		 <button onclick="deleteByAjax('${item.username}',${item.cid})" 
              		 type="button" class="btn btn-danger">DELETE</button>
                &nbsp;&nbsp;
                  <a href="esignup?cid=${item.cid}">
              		 <button type="button" class="btn btn-primary">Edit</button>
               </a>
         
         </td>
      </tr>
      </c:forEach>
      
    </tbody>
  </table>
  
   <b style="background-color: yellow;">Employees Data!</b>            
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>SNO</th>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
    
     <c:forEach items="${employeeDTOs}" var="item">
      <tr>
        <td>${item.sno}</td>
        <td>${item.name}</td>
        <td>${item.email}</td>
        <td>${item.age}</td>
         <td>
              		 <button type="button" class="btn btn-danger">DELETE</button>
                &nbsp;&nbsp;
              		 <button type="button" class="btn btn-primary">Edit</button>
              		  <a href="addEmployee">  
              		  <button type="button" class="btn btn-warning">Add</button>
              		  </a>
         
         </td>
      </tr>
      </c:forEach>
      
    </tbody>
  </table>
       
   </div>

</body>
</html>