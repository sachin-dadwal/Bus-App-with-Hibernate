<html>
<body>
	<div align="center">
		<form action="UpdateController" method="post">
			 
<%

String message=(String)request.getAttribute("message");
int busid=Integer.parseInt(request.getParameter("busid"));
request.setAttribute("busid", busid);
System.out.println(busid);

if(message!=null)
{%>
<h1><%=message%></h1>
	
<%}
%> 


			<pre>

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