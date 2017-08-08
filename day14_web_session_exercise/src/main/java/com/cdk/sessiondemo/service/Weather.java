package com.cdk.sessiondemo.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Weather extends javax.servlet.http.HttpServlet {

    Map<String,String> data = new HashMap<String,String>();

    public void init() {

        data.put("Pune","22");
        data.put("Mumbai","28");
        data.put("Delhi","42");
        data.put("GOA","23");
    }

    public void destroy() {
        data.clear();
        data = null;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{

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
pw.write("<br></br>");
        response.sendRedirect("/news");
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
