
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>yayy , we did it</title>
</head>
<body>
<h1> Congrats dude</h1>

<h2>${msg}</h2>
<h2>${headerMessage}</h2>
<h2>here: ${mystudent.name}</h2>
<table>

  <tr>
    <td>Students name :  </td>
    <td>${mystudent.name}</td>

  </tr>

  <tr>
    <td>Students hobby: </td>
    <td>${mystudent.hobby}</td>


  </tr>

  <tr>
    <td>Students address: </td>
    <td>${mystudent.address.city}</td>


  </tr>


</table>

</body>
</html>
