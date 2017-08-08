package com.cdk.sessiondemo.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Login extends javax.servlet.http.HttpServlet {

    HashMap<String, String> authenticationHashmap = null;


    @Override
    public void init() throws ServletException {
//        super.init();
        authenticationHashmap = new HashMap<String, String>();
        authenticationHashmap.put("rajan", "nosecret");
        authenticationHashmap.put("ishan", "secret");
        authenticationHashmap.put("jagga", "dakku");
    }

    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");

        HttpSession session = request.getSession();
        PrintWriter writer = response.getWriter();
        System.out.println("=======================================" + session.getId());
        writer.write("<br>=======================================<br>" + session.getId());
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        writer.write("<br>got username password");
        if (authenticationHashmap.get(username).equals(password)) {
            session.setAttribute("LoginStatus", "LOGGED_IN");
            System.out.println("LOGGED_IN Session Id" + session.getId());
            writer.write("<br> status LOGGED_IN");
            writer.write("<a href=\"/news\"></a>");
            writer.write("<a href=\"/weather\"></a>");
            writer.write("<a href=\"/logout\"></a>");
           // writer.write("<a href=\"/\"></a>");
            /*RequestDispatcher rd = request.getRequestDispatcher("/news");
            rd.forward(request,response);*/
        } else {
            session.setAttribute("LoginStatus", "LOGGED_OUT");
            writer.write("<br>status LOGGED_OUT..Please Try Again");
        }
        /*Iterator<Map.Entry<String, String>> entryIterator = authenticationHashmap.entrySet().iterator();
        for (Map.Entry<String, String> entry : authenticationHashmap.entrySet()) {

            if (entry.getKey().equals(username) && entry.getValue().equals(password)) {
                session.setAttribute("LoginStatus", "LOGGED_IN");
                System.out.println("==================LOGGED_IN================");
                RequestDispatcher rd=request.getRequestDispatcher("/news");

            }else
                session.setAttribute("LoginStatus","LOGGED_OUT");
        }*/


    }

    @Override
    public void destroy() {
        super.destroy();
        authenticationHashmap = null;
    }
}

