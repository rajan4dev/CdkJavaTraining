package com.cdk.sessiondemo.filter;

import com.sun.deploy.net.HttpRequest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class LoginCheckFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession();


        ;
        //System.out.println(session.getId());
        Object loginStatus = session.getAttribute("LoginStatus");
        PrintWriter writer = resp.getWriter();

        if(loginStatus=="LOGGED_IN")
        {

            chain.doFilter(req, resp);
            RequestDispatcher rd=request.getRequestDispatcher("/news");
            rd.forward(req,resp);
        }else {
            RequestDispatcher rd=request.getRequestDispatcher("/login");
            rd.forward(req,resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
