<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Emrecan
  Date: 18.11.2015
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADMISSIONFORM</title>
</head>
<body>

<h2>   Horay I'am admission!!</h2>
<form:errors path="mystudent.*" />
<form action="submitAdmissionForm" method="post">

  <p>
    Student's name : <input type="text" name="name" />
  </p>
  <p>
    Student's hobby : <input type="text" name="hobby" />
  </p>

  <p>
    Student's address : <input type="text" name="address.city" />
  </p>



  <input type="submit" value="click here to submit the form please" />
</form>

</body>
</html>
