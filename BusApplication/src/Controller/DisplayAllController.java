package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
public class DisplayAllController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
 
	SessionFactory factory=null;
	public void init()
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		factory=cfg.buildSessionFactory();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		Session session6=factory.openSession();
		
		List<Bus>dto=session6.createCriteria(Bus.class).list();
		 request.setAttribute("dto", dto);
		 request.getRequestDispatcher("DisplayAll.jsp").forward(request, response);

	}
	public void distroy()
	{
		factory.close();
	}

}
