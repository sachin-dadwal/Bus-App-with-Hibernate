<html>
<body>

	<%@ page import="java.util.*"%>
	<%@ page import="javax.sql.*"%>
	<%@ page import="java.sql.*"%>
	<%@ page import="java.io.*"%>
	<%@ page import="dto.Bus"%>
	<div align="center">
	<form action="SearchController" method="Post">
		<%
			Bus dto = (Bus)request.getAttribute("dto");
			String message = (String) request.getAttribute("message");
			if (dto != null)
			{%>
			
			<h2><a href="login.jsp">Home</a></h2>
			<br>
<h1>Searched ID details</h1>
<br>

					<table border="5">
				<%  
				{
		%>


		<tr>

			<td>Busid:<h3><%=dto.getBusid()%></h3></td>
			
			<td>BusName:<h3><%=dto.getBusname()%></h3></td>
			
			<td>Source:<h3><%=dto.getSource()%></h3></td>

			<td>Destination:<h3><%=dto.getDestination()%></h3></td>

			<td>Fare:<h3><%=dto.getFare()%></h3></td>

			
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












