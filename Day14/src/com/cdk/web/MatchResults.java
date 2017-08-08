package com.cdk.web;

import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class MatchResults extends javax.servlet.http.HttpServlet {

    CopyOnWriteArraySet<CricketMatch> matches = null;

    @Override
    public void init() throws ServletException {
        super.init();
        matches = new CopyOnWriteArraySet<>();
        matches.add(new CricketMatch("India", "Pakistan", "Dubai", MatchStatus.FINISHED, "India"));
        matches.add(new CricketMatch("India", "England", "Dubai", MatchStatus.FINISHED, "England"));
        matches.add(new CricketMatch("India", "Australia", "Dubai", MatchStatus.FINISHED, "Australia"));
        matches.add(new CricketMatch("India", "NewZealand", "Dubai", MatchStatus.FINISHED, "NewZealand"));
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter responseWriter=response.getWriter();

        String country1 = request.getParameter("country1");
        String country2 = request.getParameter("country2");
        String matchType = request.getParameter("matchType");
        /*if (country1.equals("India")) {
            responseWriter.write("India Won");
        } else System.out.println("Some Error");*/

        Iterator<CricketMatch> matchIterator = matches.iterator();
        while (matchIterator.hasNext()){
            CricketMatch cricketMatch=matchIterator.next();
            if(country1.equals(cricketMatch.country1)&&country2.equals(cricketMatch.country2)){
               responseWriter.write("WINNER: "+cricketMatch.winner);
            }
        }


    }
}
