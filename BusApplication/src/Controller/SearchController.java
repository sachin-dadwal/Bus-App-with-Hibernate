package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




import dto.Bus;

/**
 * Servlet implementation class RegisterController
 */
public class SearchController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
 
	SessionFactory factory=null;
	public void init()
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		factory=cfg.buildSessionFactory();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
	 Bus dto1= new Bus();
	 String message="";
	 try
	 {
	int busid=Integer.parseInt(request.getParameter("busid"));
	System.out.println(busid);
		dto1.setBusid(busid);
	 Session session3=factory.openSession();
	 session3.beginTransaction();
	 	 
	 
	 Bus dto=(Bus)session3.get(Bus.class, busid);
	   
	 
	 	System.out.println(dto.getBusid());
	 	System.out.println(dto.getBusname());
	 	System.out.println(dto.getDestination());
	 	System.out.println(dto.getFare());
	 	System.out.println(dto.getSource());
	 	pw.println("Busid:"+dto.getBusid());
	 	pw.println();
	 	pw.println("Bus name:"+dto.getBusname());
	 	pw.println();
	 	pw.println("Source"+dto.getSource());
	 	pw.println();
	 	pw.println("Destination:"+dto.getDestination());
	 	pw.println();
	 	pw.println("Fare:"+dto.getFare());
	 	
	 	
	 	
	 	
		 //session3.getTransaction().commit();
	
	 //session3.close();
	 //message="Data deleted sucessfully";
	/*System.out.println(dto);
	 pw.println(dto);*/
	 	 request.setAttribute("dto", dto);
	 request.getRequestDispatcher("SearchResult.jsp").forward(request, response);
	 
	 
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
		message="data is not deleted sucessfully"; 
		request.setAttribute("message", message);
		 request.getRequestDispatcher("Search.jsp").forward(request, response);
		 
		 
	 }
	 
	 
	 
	 /*request.getRequestDispatcher("Register.jsp").forward(request, response);
	 request.setAttribute("message", message);*/
	 
		
	}
	public void distroy()
	{
		factory.close();
	}

}
