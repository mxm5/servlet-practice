<!DOCTYPE html>
<html>
<body>

<h2>HTML Forms</h2>

<%--<form action="add" method="POST">--%>
<form action="add.jsp" method="POST">
  <label for="n1">First name:</label><br>
  <input type="text" id="n1" name="n1" value="John"><br>
  <label for="n2">Last name:</label><br>
  <input type="text" id="n2" name="n2" value="Doe"><br><br>
  <input type="submit" value="Submit">
</form> 

<p>If you click the "Submit" button, the form-data will be sent to a page called "/action_page.php".</p>

</body>
</html>

