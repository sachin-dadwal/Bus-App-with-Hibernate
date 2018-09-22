package Controller;

import java.io.IOException;

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
public class UpdateController extends HttpServlet
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
	 Bus dto= new Bus();
	 String message="";
	 try
	 {
	 int busid=Integer.parseInt(request.getParameter("busid"));
	 
	 System.out.println("Bus id:"+busid);
	 
	 String busname=request.getParameter("busname");
	 String source=request.getParameter("source");
	 String destination=request.getParameter("destination");
	 double fare=Double.parseDouble(request.getParameter("fare"));
	
	 
	 dto.setBusid(busid);
	 dto.setBusname(busname);
	 dto.setDestination(destination);
	 dto.setFare(fare);
	 dto.setSource(source);
	 
	 Session session2=factory.openSession();
	 session2.beginTransaction();
	 session2.update(dto);
	 session2.getTransaction().commit();

	 System.out.println("bus name:"+busname);
	 session2.close();
	 message="Data updated sucessfully";
	 
	 request.setAttribute("message", message);
	 request.getRequestDispatcher("Update.jsp").forward(request, response);
	 
	 
	 }
	 catch(Exception e)
	 {
		message="data is not updated sucessfully"; 
		request.setAttribute("message", message);
		 request.getRequestDispatcher("Update.jsp").forward(request, response);
		 
		 
	 }
	 
	 
	 
	 request.getRequestDispatcher("Register.jsp").forward(request, response);
	 request.setAttribute("message", message);
	 
		
	}
	public void distroy()
	{
		factory.close();
	}

}


