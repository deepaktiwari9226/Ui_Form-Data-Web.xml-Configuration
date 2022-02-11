package com.Servlet;

import java.io.*;

import javax.servlet.*;

public class FirstServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) 
	throws ServletException, IOException 
	{
		String name =req.getParameter("nm");
		String place = req.getParameter("pl");
		// Display Response on Ui [ Front End ] //
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html> <body bgcolor ='red'>"
		+ "<h1> Your name is = "  +name+ " from " +place+  "<h1>"
		+ " </body> </html>");

		out.close();

	}

}
