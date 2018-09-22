<html>
<body>

	<%@ page import="java.util.*"%>
	<%@ page import="javax.sql.*"%>
	<%@ page import="java.sql.*"%>
	<%@ page import="java.io.*"%>
	<%@ page import="dto.Bus"%>
	<div align="center">
	<form action="DisplayAllController" method="get">
		<%
		List<Bus>dto = (List<Bus>)request.getAttribute("dto");
			String message = (String) request.getAttribute("message");
			if (dto != null)
			{%>
			
			<h2><a href="login.jsp">Home</a></h2>
			<br>
<h1>All Available details</h1>
<br>

					<table border="5">
				<%  
				 for (Bus dto1 : dto) 
				{
	

		%>


		<tr>

			<td>Busid:<h3><%=dto1.getBusid()%></h3></td>
			
			<td>BusName:<h3><%=dto1.getBusname()%></h3></td>
			
			<td>Source:<h3><%=dto1.getSource()%></h3></td>

			<td>Destination:<h3><%=dto1.getDestination()%></h3></td>

			<td>Fare:<h3><%=dto1.getFare()%></h3></td>

			
			<%
				}
			%>


			<%
				}
			%>

			</table>
			
	</form>
</div>
</body>
</html>












