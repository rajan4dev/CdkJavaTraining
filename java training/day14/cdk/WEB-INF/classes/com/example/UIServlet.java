package com.example;

import java.io.*;
import javax.servlet.*;

public class UIServlet extends GenericServlet {
		
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{

		response.setContentType("text/html");		

		PrintWriter pw = response.getWriter();
		
		pw.write("<html>");
		pw.write("<body>");
		pw.write("<h1>Life is cool.</h1>");
		pw.write("<h2>Java is cool.</h2>");
		pw.write("</body>");
		pw.write("</html>");
	}	

}