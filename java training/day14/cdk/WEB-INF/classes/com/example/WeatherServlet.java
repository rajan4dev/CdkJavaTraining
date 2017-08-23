package com.example;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WeatherServlet extends HttpServlet {

	Map<String,String> data = new HashMap<>();			

	public void init()  throws ServletException {
	
		data.put("Pune","22"); 
		data.put("Mumbai","28"); 
		data.put("Delhi","42"); 
		data.put("GOA","23"); 
	}

	public void destroy() {
		data.clear();
		data = null;	
	}	

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		/*System.out.println(request.getHeader("Content-Type"));
		System.out.println(request.getHeader("Content-Length"));
		System.out.println(request.getHeader("User-Agent"));
		System.out.println(request.getHeader("Locale"));*/

		Enumeration<String> names =  request.getHeaderNames();
		while(names.hasMoreElements()){
			System.out.println(names.nextElement());
		}
				
		String methodValue = request.getMethod();
		
		System.out.printf("Request type is : %s%n",methodValue);

		String cityName = request.getParameter("city");
		String dayName = request.getParameter("day");
		
		PrintWriter pw = response.getWriter();
		pw.write("Weather of the "+cityName+" on "+dayName+" day is : "+data.get(cityName)+" degree.");
	}	

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

		String methodValue = request.getMethod();
		
		System.out.printf("Request type is : %s%n",methodValue);

		String cityName = request.getParameter("city");
		String dayName = request.getParameter("day");
		
		PrintWriter pw = response.getWriter();
		pw.write("Weather of the "+cityName+" on "+dayName+" day is : "+data.get(cityName)+" degree.");
	}	

}