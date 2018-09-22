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
public class DeleteController extends HttpServlet
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
	System.out.println(busid);
		dto.setBusid(busid);
	 Session session1=factory.openSession();
	 session1.beginTransaction();
		 session1.delete(dto);
		 session1.getTransaction().commit();
	
	 session1.close();
	 message="Data deleted sucessfully";
	 
	 request.setAttribute("message", message);
	 request.getRequestDispatcher("Delete.jsp").forward(request, response);
	 
	 
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
		message="data is not deleted sucessfully"; 
		request.setAttribute("message", message);
		 request.getRequestDispatcher("Delete.jsp").forward(request, response);
		 
		 
	 }
	 
	 
	 
	 /*request.getRequestDispatcher("Register.jsp").forward(request, response);
	 request.setAttribute("message", message);*/
	 
		
	}
	public void distroy()
	{
		factory.close();
	}

}
