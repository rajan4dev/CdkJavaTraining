package com.example;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		System.out.println("I am in AServlet!!!");
		
		String name = request.getParameter("user");

		HttpSession session = request.getSession();				
		System.out.printf("Session ID : %s%n",session.getId());
		session.setAttribute("U_NAME",name);

		PrintWriter pw = response.getWriter();
		pw.write("Hello Mr. "+name);
	}	

}