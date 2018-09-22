package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil 
{
	private final static SessionFactory factory=new Configuration().configure().buildSessionFactory();
	public static SessionFactory getSessionFactory()
	{
		return factory;
		
	}

}
