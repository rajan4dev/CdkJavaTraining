package com.example;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BServlet extends HttpServlet {


	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		System.out.println("I am in BServlet!!!");

		HttpSession session = request.getSession();				
		System.out.printf("Session ID : %s%n",session.getId());

		String name = (String)session.getAttribute("U_NAME");

		PrintWriter pw = response.getWriter();
		pw.write("Hello Mr. "+name+", I remember you!!!!");
	}	

}