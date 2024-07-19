package com.swara.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.hibernate.Session;
import org.hibernate.cfg.sessionFactory;
import org.hibernate.cfg.AnnotactionConfiguration;
import org.hibernate.cfg.Configuration;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		HttpSession session = request.getSession();
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
		String query="from user as u where u.Uname=:name and u.pass = :pass";
		List l = sess.createQuery(query).setString("name",name).setString("pass",pass).list();
		Iterator it = l.iterator();
		int count=0;
		while(it.hasNext())
		{
			User u =(User) it.next();
			String Uname=u.getUname();
			String Uid =String.valueOf(u.getUid());
			Session.setAttribute("Uname",Uname);
			Session.setAttribute("Uid",Uid);
			counts++;
			
		}
		if(counts>0)
	    {
	    	response.sendRedirect("welcome.jsp");
	    }
	    else
	    {
	    	 response.sendRedirect("Faild.jsp");
	    }
	
	}

}
