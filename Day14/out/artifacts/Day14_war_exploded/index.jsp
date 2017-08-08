<%--
  Created by IntelliJ IDEA.
  User: bhirudr
  Date: 8/3/2017
  Time: 1:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>CricketResults</title>


  </head>
  <body>
  <form action="MatchResults" method="get" autocomplete="on">
  Country1 : <input type="text" value="India" name="country1">
  Country2 : <input type="text" value="Australia" name="country2">
  Match Type : <input type="text" value="One Day" name="matchType">
    <button type="submit">Submit</button>
  </form>
  </body>
</html>
