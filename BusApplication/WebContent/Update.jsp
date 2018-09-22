<html>
<body>
	<div align="center">
		<form action="UpdateController" method="post">
			 
<%

String message=(String)request.getAttribute("message");
if(message!=null)
{%>
<h1><%=message%></h1>
	
<%}
%> 
<h2><a href="login.jsp">Home</a></h2>
			<pre>

<h1>Enter bus id you want to update </h1>


BusID:       <input type="text" name="busid"><br>
<h1>Enter the updated   </h1>

BusName:     <input type="text" name="busname"><br>
Source:      <input type="text" name="source"><br>
Destination: <input type="text" name="destination"><br>
Fare:        <input type="text" name="fare"><br>



&nbsp; &nbsp; &nbsp; &nbsp; <input type="submit" name="Update"> &nbsp;  <input
					type="reset" name="Reset">

</pre>


		</form>
	</div>
</body>
</html>