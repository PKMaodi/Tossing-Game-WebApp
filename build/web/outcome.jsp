<%-- 
    Document   : outcome
    Created on : 17 Apr 2023, 11:05:43
    Author     : dell
--%>

<%@page import="za.ac.tut.Model.GameT"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome</title>
    </head>
    <body>
        <%
            Integer tossCnt = (Integer)session.getAttribute("tossCnt");
            Integer compWon = (Integer)session.getAttribute("compWon");
            Integer userWon = (Integer)session.getAttribute("userWon");
        %>
        <h1>Results!</h1>
        <form> 
            <table>
                <tr>
                    <td>
                        <p>You have won <%=userWon%> games out of <%=tossCnt%></p>
                    </td>
                    
                </tr>
                <tr>
                    <td>
                        <p>You have lost <%=compWon%> games out of <%=tossCnt%></p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <button>
                            <a href="Toss.jsp">Play again</a>
                        </button>
                        <button>
                            <a href="End.do">End Game</a>
                        </button>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
