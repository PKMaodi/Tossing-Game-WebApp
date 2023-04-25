<%-- 
    Document   : result
    Created on : 18 Apr 2023, 9:49:37 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String question = (String)session.getAttribute("question");
        String corrctAns = (String)session.getAttribute("corrctAns");
        String userAns = (String)session.getAttribute("userAns");
        
        %>
        <h1>Hello World!</h1>
        <table>
            <tr>
                <td>
                    Correctly answered:
                </td>
                <td>
                    <%=question%>
                </td>
            </tr>
            <tr>
                <td>
                    Your answer:
                </td>
                <td>
                    <%=userAns%>
                </td>
            </tr>
            <tr>
                <td>
                    Correct Answer:
                </td>
                <td>
                    <%=corrctAns%>
                </td>
            </tr>
            <tr>
                <td>
                    <button>
                        <a href="Question.do">
                            Next question
                        </a>
                    </button>
                </td>
               
            </tr>
        </table>
    </body>
</html>
