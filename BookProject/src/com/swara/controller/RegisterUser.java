package com.swara.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String num = request.getParameter("number");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String pass = request.getParameter("pass");
		
		User u = new User();
		u.setUname(name);
		u.setUmob(num);
		u.setUgender(gender);
		u.setUdob(dob);
		u.setPass(pass);
		
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
	    String query = "from User as u where u.Uname =:name";
	    List list = sess.createQuery(query).setString("name", name).list();
	    Iterator it = list.iterator();
	    int counts=0;
	   if(it.hasNext())
	   {
			 response.sendRedirect("faledReg.jsp");
	   }
	   else
	   {
		sess.save(u);
		sess.getTransaction().commit();
		sess.close();
		 response.sendRedirect("RegSuss.jsp");
	   }
	}	

}
