<html>
<body>
	<div align="center">
		<form action="DeleteController" method="post">
			 
<%

String message=(String)request.getAttribute("message");
if(message!=null)
{%>
<h1><%=message%></h1>
	
<%}
%> 
			<pre>
<h2><a href="login.jsp">Home</a></h2>
<h1>Enter bus id you want to delete </h1>



BusID:       <input type="text" name="busid"><br>



&nbsp; &nbsp; &nbsp; &nbsp; <input type="submit" name="Register"> &nbsp;  <input
					type="reset" name="Reset">

</pre>


		</form>
	</div>
</body>
</html>